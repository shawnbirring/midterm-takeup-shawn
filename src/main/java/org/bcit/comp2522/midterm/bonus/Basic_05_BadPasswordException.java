package org.bcit.comp2522.midterm.bonus;

public class Basic_05_BadPasswordException extends RuntimeException {
    public Basic_05_BadPasswordException() {
        super("Password must be at least 8 characters long");
    }
}
