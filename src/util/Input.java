package util;

import java.util.Scanner;

public class Input {
    //member variables
//    private Scanner scanner;
    private String userString;
    private Scanner scanner = new Scanner(System.in);
//    private Scanner scanner;


    //constructor
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }


    //member methods

    String getString() {
        System.out.println("Please type a some words: ");
        return this.userString = scanner.next();
    }

    boolean yesNo() {
        System.out.println("Make a choice: (y|n)");
        String userChoice = scanner.next();
        if (!userChoice.equalsIgnoreCase("y")) {
            return false;
        }
        return true;
    }

    int getInt() {
        System.out.println("Pick a number: ");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    int getInt(int min, int max) {
        System.out.println("Pick a number: ");
        int userNumber = scanner.nextInt();
        if (userNumber > max || userNumber < min) {
            return getInt(min, max);
        }
        return userNumber;
    }

    double getDouble() {
        System.out.println("Pick a number: ");
        double userNumber = scanner.nextDouble();
        return userNumber;
    }

    double getDouble(double min, double max) {
        System.out.println("Pick a number: ");
        double userNumber = scanner.nextDouble();
        if (userNumber > max || userNumber < min) {
            return getDouble(min, max);
        }
        return userNumber;
    }

}

