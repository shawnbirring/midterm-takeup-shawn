package org.bcit.comp2522.midterm.bonus;

import java.util.ArrayList;
import java.util.Random;

public class Basic_01_car {
    /**
     * this is a car class, each car is given a make, model, and id(randomy generated)
     * each car has a xpos and ypos, and a runs counter
     * each car can move, and all cars made in the main method are stored in an arraylist
     * the main method creates 10 cars, and moves them a random number of times
     * then prints out the id, make, model, xpos, ypos, and runs of each car
     *
     * Comparison to Basic_01 on Midterm:
     * both classes test the use of a class to persist state, this is shown in my class by the use of the id, xpos, ypos, and runs
     * the main method of this class creates 10 cars also tests the use of an arraylist to store objects
     * the main method also tests the use of a random number generator to move the cars a random number of times
     * the main method also shows that each cars ID is unique
     * the main method also shows that each car has a make and model which mathes those of which were in the array
     * the getter method also shows how given the make we can get the model of the car in the arraylist
     *
     */
    private int id;
    private String make;
    private String model;
    private float xpos;
    private float ypos;

    private int runs;
    static ArrayList<Basic_01_car> cars = new ArrayList<Basic_01_car>();

    // this is the constructor for the car class, it takes in a make and model and generates a random id
    // it also sets the xpos and ypos to 0 and the runs to 0
    public Basic_01_car(String make, String model) {
        Random rand = new Random();
        this.id = rand.nextInt(100) + 1;
        this.make = make;
        this.model = model;
        this.xpos = 0;
        this.ypos = 0;
        this.runs = 0;
    }

    // this method moves the car by the given x and y values and increments the runs counter
    void move(float x, float y) {
        this.xpos += x;
        this.ypos += y;
        this.runs++;
    }

    // this method adds a car to the arraylist
    static void add(Basic_01_car car) {
        cars.add(car);
    }

    // this method goes through the arraylist and returns the model of the car with the given make
    static String get(String make) {
        for (Basic_01_car car : cars) {
            if (car.make.equals(make)) {
                return car.model;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        // these are the array's it just holds some make and models
        String[] makes = {"Honda", "Toyota", "Ford", "Chevrolet", "Nissan", "BMW", "Mercedes", "Audi", "Volkswagen", "Subaru"};
        String[] models = {"Civic Type R", "GR Supra", "GT", "C8 Z06", "R34 GTR", "M4", "C63 AMG", "RS4", "Veyron", "WRX STI"};

        // this is the for loop it creates 10 cars with the corresponding make/model and adds them to the arraylist
        for (int i = 0; i < 10; i++) {
            Basic_01_car car = new Basic_01_car(makes[i], models[i]);
            add(car);
        }

        Random rand = new Random();

        // this is the arraylist, it shows that each car has a unique id, and that each car has a make and model which matches those of the array

        for (Basic_01_car car : cars) {
            System.out.println("Car ID: " + car.id);
            System.out.println("Car Make: " + car.make + "\t" + "Car Model: " + car.model);
            for (int i = 0; i < rand.nextInt(10) + 1; i++) {
                float x = rand.nextFloat(100);
                float y = rand.nextFloat(100);
                car.move(x, y);
            }
            System.out.println("Car X Position: " + car.xpos + "\t" + "Car Y Position: " + car.ypos + "\t" + "Car Runs: " + car.runs);
        }

        // this is the getter method, it shows that given the make of the car we can get the model of the car

        System.out.println("The model of Honda is: " + get("Honda"));
        System.out.println("The model of Toyota is: " + get("Toyota"));
        System.out.println("The model of Ford is: " + get("Ford"));
        System.out.println("The model of Chevrolet is: " + get("Chevrolet"));
        System.out.println("The model of Nissan is: " + get("Nissan"));
        System.out.println("The model of BMW is: " + get("BMW"));
        System.out.println("The model of Mercedes is: " + get("Mercedes"));
        System.out.println("The model of Audi is: " + get("Audi"));
        System.out.println("The model of Volkswagen is: " + get("Volkswagen"));
        System.out.println("The model of Subaru is: " + get("Subaru"));

        //this just shows that the cars x and y are updated with one move
        Basic_01_car carT = new Basic_01_car("Pagani", "Huayra");
        System.out.println("Make: " + carT.make + "\t" + "Model: " + carT.model + "\t" + "ID: " + carT.id);
        System.out.println("xpos: " + carT.xpos + "\t" + "ypos: " + carT.ypos + "\t" + "runs: " + carT.runs);
        carT.move(10, 10);
        System.out.println("xpos: " + carT.xpos + "\t" + "ypos: " + carT.ypos + "\t" + "runs: " + carT.runs);



    }

}
