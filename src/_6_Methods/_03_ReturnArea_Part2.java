package _6_Methods;

import java.util.*;

public class _03_ReturnArea_Part2 {

    // Method 1 - area of a rectangle
    public static double area(double a, double b) {

        return a * b; // returning the result of multiplication
    }

    // Method 2 - wrong input check
    public static double inputCheck() {
        Scanner scr = new Scanner(System.in);

        double num;

        do { // wrong input check
            num = scr.nextDouble();

            if (num <= 0) {
                System.out.println("Wrong input!");
                System.out.println("\n" + "Input again: ");
            }
        } while (num <= 0);

        return num; // value is returned
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("\n" + "Input data for a length 'a': ");
        double a = inputCheck(); // method 2 is called

        System.out.println("\n" + "Input data for a width 'b'");
        double b = inputCheck(); // method 2 is called

        // calling method 1 - the result
        System.out.println("\n" + "The area of rectangle with sides " +
                a + " cm and " + b + " cm is: " + area(a, b) + " cm2");
    }
}
