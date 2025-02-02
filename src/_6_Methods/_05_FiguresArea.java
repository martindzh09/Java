package _6_Methods;

import java.util.*;

public class _05_FiguresArea {

    // method 0 - List of options (menu)
    public static void optionsList() {
        System.out.println("\n" + " _____________________ ");
        System.out.println("| Geometrical figures |");
        System.out.println(" --------------------- ");

        System.out.println("\n" + "1. Triangle           |");
        System.out.println("2. Rectangle          |");
        System.out.println("3. Circle             |");

        System.out.println("\n" + "4. Exit the program   |");
        System.out.println(" _____________________ ");
    }

    // method 1 - Area of a triangle
    public static void triangle(double a, double h) {
        System.out.println("\n" + "Formula for the area of a triangle - [(a * ha) / 2]");

        double area = (a * h) / 2;
        System.out.println("Area of the triangle is " + area + " cm2");
    }

    // method 2 - Area of a rectangle
    public static void rectangle(double a, double b) {
        System.out.println("\n" + "Formula for the area of a rectangle - [a * b]");

        double area = a * b;
        System.out.println("Area of the rectangle is " + area + " cm2");
    }

    // method 3 - Area of a circle
    public static void circle(double r) {
        System.out.println("\n" + "Formula for the area of a circle - [(PI) * r * r]");

        double circleArea = Math.PI * Math.pow(r, 2);
        System.out.println("Area of the circle is " + String.format("%.2f", circleArea) + " cm2");
        // System.out.printf("Area of the circle is %.2f cm2", circleArea);
    }

    // method 4 - Valid data for sides, radius, etc.
    public static double validData() {
        Scanner kbd = new Scanner(System.in);

        double x; // variable for a certain input (side, height, etc.)

        do { // wrong input check
            x = kbd.nextDouble();

            // segments are measured with absolute values
            if (x <= 0) { // message for an invalid data
                System.out.println("Invalid input data! Only positive numbers data!");
            }
        } while (x <= 0);

        // value is returned as a result of a valid input
        return x; // then method is "broken"
    }

    // Main method
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int option; // one of the figures

        do { // program executes till the option that closes it
            // list of options is printed
            optionsList(); // method 0 is called

            System.out.println("\n" + "Input the number corresponding to your choice: ");
            option = kb.nextInt();

            switch (option) {
                case 1: // 1. Triangle is chosen
                    System.out.println("\n" + "T R I A N G L E");

                    System.out.println("Input data for a side: ");
                    double a = validData(); // method 4 - for a valid side, is called

                    System.out.println("\n" + "Input data for the height to this side: ");
                    double height = validData(); // method 4 - for a valid side, is called

                    triangle(a, height); // method 1 is called
                    break;

                case 2: // 2. Rectangle is chosen
                    System.out.println("\n" + "R E C T A N G L E");

                    System.out.println("Input data for a length: ");
                    double length = validData(); // method 4 - for a valid side, is called

                    System.out.println("\n" + "Input data for a width: ");
                    double width = validData(); // method 4 - for a valid side, is called

                    rectangle(length, width); // method 2 is called
                    break;

                case 3: // 3. Circle is chosen
                    System.out.println("\n" + "C I R C L E");

                    System.out.println("Input data for radius: ");
                    double radius = validData(); // method 4 - for a valid radius, is called

                    circle(radius); // method 3 is called
                    break;

                default: // exception to the options' numbers
                    if (option != 4) {
                        System.out.println("Unavailable option");
                    } // * loop iterates again; list of options is printed, etc.
            }
        } while (option != 4); // the option that breaks the loop

        // the executing program is stopped
        System.out.println("\n" + "Exiting the program...");

        kb.close();
    }
}
