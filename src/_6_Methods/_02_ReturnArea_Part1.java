package _6_Methods;

import java.util.*;

public class _02_ReturnArea_Part1 {

    // Method for area of rectangle
    public static double area(double a, double b) {
        double area;
        area = a * b;

        // value is returned as a result of the method
        return area; // it needs to be assigned
    }

    // Main method
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double x, y; // variables for each of the rectangle's sides
        double area;

        do { // wrong input check for side 'x'
            System.out.println("\n" + "Input data for side 'x': ");
            x = kb.nextDouble();

            if (x <= 0) { // message for a wrong input
                System.out.println("Invalid data! (x > 0)");
            }
        } while (x <= 0);

        do { // wrong input check for side 'y'
            System.out.println("\n" + "Input data for side 'y': ");
            y = kb.nextDouble();

            if (y <= 0) { // message for a wrong input
                System.out.println("Invalid data! (y > 0)");
            }
        } while (y <= 0);

        // method for the area is called
        area = area(x, y); // value of the method's result is assigned
        System.out.println("\n" + "Area of the rectangle is: " + area + " cm2");

        /* Result of the method is due to the values of the specified parameters (x, y)
            accepting the functionalities of 'a' and 'b' within the area method. */

        kb.close();
    }
}
