package org.bcit.comp2522.midterm.bonus;

public class Basic_05_WrongPasswordException extends RuntimeException {
    public Basic_05_WrongPasswordException() {
        super("Password is incorrect");
    }
}
