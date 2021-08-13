package util;

import java.util.Scanner;

public class Input {
    //member variables
//    private Scanner scanner;
    private String userString;
    private Scanner scanner;


    //constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }


    //member methods

    public String getString() {
        System.out.println("Please type a some words: ");
        return this.userString = scanner.next();
    }

    public boolean yesNo() {
        System.out.println("Make a choice: (y|n)");
        String userChoice = scanner.next();
        if (!userChoice.equalsIgnoreCase("y")) {
            return false;
        }
        return true;
    }

    public int getInt() {
//        System.out.println("Pick a number: ");
        int userNumber = Integer.valueOf(getString()) ;
        return userNumber;
    }

    public int getInt(int min, int max) {
        System.out.println("Pick a number: ");
        int userNumber;
        try {
            userNumber = Integer.valueOf(getString()) ;
        } catch (Exception e) {
            throw new NumberFormatException();
        }
        return userNumber;
    }

    public double getDouble() {
        System.out.println("Pick a number: ");
        double userNumber;
        try {
             userNumber = Double.valueOf(getString()) ;
        } catch (Exception e) {
           throw new NumberFormatException();
        }
        return userNumber;
    }

    public double getDouble(double min, double max) {
        System.out.println("Pick a number: ");
        double userNumber = scanner.nextDouble();
        if (userNumber > max || userNumber < min) {
            System.out.println("Try again! ");
            return getDouble(min, max);
        }
        System.out.println("That's a valid number!");
        return userNumber;
    }

}

