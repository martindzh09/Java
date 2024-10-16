package _1_ConditionalStatements;

import java.util.*;

public class _08_Geometry {
    public static void main(String[] args) {

        Scanner kbi = new Scanner(System.in);
        Scanner kbd = new Scanner(System.in);

        System.out.println("Choose from: ");
        // Option list:
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");

        int type = kbi.nextInt(); // a variable for different options in the 'menu' above

        switch (type) {
            case 1: // a triangle
                System.out.println("Input a: ");
                double a1 = kbd.nextDouble();

                System.out.println("Input ha: ");
                double ha1 = kbd.nextDouble();

                if (a1 > 0 && ha1 > 0) {
                    System.out.println("[S = (a * ha) / 2]" + " => " + "S = " + ((a1 * ha1) / 2) + " cm2");
                }
                else {
                    System.out.println("Non-valid data!");
                }
                break;

            case 2: // a square
                System.out.println("Input a: ");
                double a2 = kbd.nextDouble();

                if (a2 > 0) {
                    System.out.println("[S = a * a]" + " => " + "S = " + (a2 * a2) + " cm2");
                }
                else {
                    System.out.println("Non-valid data!");
                }
                break;

            case 3: // a circle
                System.out.println("Input radius (r): ");
                double r = kbd.nextDouble();

                if (r > 0) {
                    System.out.println("[S = pi * r * r]" + " => " + "S = " + (Math.PI * Math.pow(r, 2)) + " cm2");
                }
                else {
                    System.out.println("Non-valid data!");
                }
                break;
        }

    }
}
