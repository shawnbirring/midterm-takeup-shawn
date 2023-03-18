package org.bcit.comp2522.midterm.bonus;

import java.util.ArrayList;

public class Basic_04_shape{

    /*
     * this class just holds all the shapes together in the arraylist and also serves as the superclass
     * we use the static methods for testing purposes and the non static methods for the actual superclass
     * all the shapes are added to the arraylist using the addShape() method which takes in any shape as a parameter
     * and all the shapes implement the areaCalculator interface
     *
     *
     * this class as well as the basic_04 on the midterm focuses on the use of interfaces
     */

    //static arraylist of shapes to hold all the shapes
    static ArrayList<Basic_04_shape> shapes;

    //used for the superclass of shapes
    int length;
    int width;

    //constructor for the superclass
    public Basic_04_shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //static methods for adding any shape type to the arraylist
    public static void addShape(Basic_04_triangle shape) {
        shapes.add(shape);
    }

    public static void addShape(Basic_04_circle shape) {
        shapes.add(shape);
    }

    public static void addShape(Basic_04_square shape) {
        shapes.add(shape);
    }

    public static void addShape(Basic_04_rectangle shape) {
        shapes.add(shape);
    }

    //main method creates shapes and adds them to the arraylist
    public static void main(String[] args) {
        shapes = new ArrayList<Basic_04_shape>();
        addShape(new Basic_04_triangle(5, 5));
        addShape(new Basic_04_circle(5, 2));
        addShape(new Basic_04_square(5, 8));
        addShape(new Basic_04_rectangle(5, 5));
        //by keeping track of total area we are proving that the shapes are implemented the interface correctly
        double totalArea = 0;
        //looping through all the shapes in the arraylist
        for (Basic_04_shape shape : shapes) {
            //checking if the shape is an instance of the interface
            if (shape instanceof Basic_04_areaCalculator_interface) {
                //if it is an instance of the interface we can cast it to the interface and use the getArea() method
                totalArea += ((Basic_04_areaCalculator_interface) shape).getArea();
            }
        }
        //printing the total area of all the shapes
        System.out.println("Total area: " + totalArea);
    }
}

