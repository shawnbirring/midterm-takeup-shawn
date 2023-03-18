package org.bcit.comp2522.midterm.bonus;

public class Basic_05_Password {

    /**
     * A password must be at least 8 characters long so when you try to create a password or set the password
     * and it is less than 8 characters long the program will throw a Basic_05_BadPasswordException
     * The exceptions are meaningful and descriptive, lets the user know what went wrong
     *
     * this is similar to the Basic_05 midterm question because both are testing good meaningful exceptions
     */

    String password;
    //constructor that will throw exception if password is not valid
    public Basic_05_Password(String password) {
        if (password.length() < 8) {
            throw new Basic_05_BadPasswordException();
        } else {
            this.password = password;
        }
    }

    //setter that will throw exception if password is not valid
    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new Basic_05_BadPasswordException();
        } else {
            this.password = password;
        }
    }

    //method that will throw an exception if the password is not correct
    public boolean correctPassword(String password) {
        if (!(this.password.equals(password))) {
            throw new Basic_05_WrongPasswordException();
        }
        return true;
    }

    public static void main(String[] args) {
        Basic_05_Password password1;
        //trying to make a bad password
        try {
            password1 = new Basic_05_Password("pass");
        } catch (Basic_05_BadPasswordException e) {
            System.out.println(e.getMessage());
        }
        password1 = new Basic_05_Password("password");
        System.out.format("password is: %s\n", password1.password);
        //trying to set a bad password
        try {
            password1.setPassword("pass");
        } catch (Basic_05_BadPasswordException e) {
            System.out.println(e.getMessage());
        }
        //trying to see if password is correct
        try {
            password1.correctPassword("passwordWrong");
            System.out.println("Password is correct");
        } catch (Basic_05_WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        //trying to see if password is correct
        try {
            password1.correctPassword("password");
            System.out.println("Password is correct");
        } catch (Basic_05_WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        //trying to set a good password
        try {
            password1.setPassword("passwordGood");
            System.out.format("new password is set: %s", password1.password);
        } catch (Basic_05_BadPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

}

