package _6_Methods;

import java.util.Scanner;

public class _03_VoidArea {

    // Method for area of rectangle
    public static void area(double a, double b) {
        double area;
        area = a * b;

        System.out.println("\n" + "Area of the rectangle is: " + area + " cm2");
    }

    // Main method
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double x, y; // variables for each of the rectangle's sides

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
        area(x, y); // method is executed, with a last printed result

        /* When type of returned value of a method is 'void', it means no value is returned.
            Those type of methods execute as usual, they only need to be called. */

        kb.close();
    }
}
