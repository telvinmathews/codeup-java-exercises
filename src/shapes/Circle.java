package shapes;

import java.util.Scanner;

public class Circle {
    //member variables
    private double radius;
    private Scanner scanner;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
//        this.scanner = new Scanner(System.in);
    }

    //member methods


    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }
    public double getCircumference() {
        double circumference= Math.PI * 2*radius;
        return circumference;
    }













}
