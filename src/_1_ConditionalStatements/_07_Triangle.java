package _1_ConditionalStatements;
import java.util.*;

public class _07_Triangle {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int typeTriangle = 0; // accepts specific values for each type of triangle

        System.out.println("Input a: ");
        double a = kbd.nextDouble(); // side a

        System.out.println("Input b: ");
        double b = kbd.nextDouble(); // side b

        System.out.println("Input c: ");
        double c = kbd.nextDouble(); // side c

        // Evidence for an existing triangle including sides a, b and c
        boolean existingTriangle = (a + b > c) && (b + c > a) && (a + c > b);
        boolean nonExistentTriangle = false; // non-existent triangle with sides a, b and c

        boolean zeroFound = a <= 0 || b <= 0 || c <= 0; // negative input or 0

        // Proof for a triangle with two equal sides:
        boolean twoEqualSides = ((a == b && a != c && b != c) || (a == c && a != b && b != c) ||
                (b == c && b != a && c != a)); // if the triangle is isosceles

        if (existingTriangle) {
            if (a != b && a != c && b != c) { // Three unequal sides (1)
                typeTriangle = 1;
                System.out.println("1. - Three different sides");
            } 
            else {
                if (twoEqualSides) { // Two equal sides (2)
                    typeTriangle = 2;
                    System.out.println("2. - Isosceles triangle");
                } else {  // Three equal sides (3)
                    typeTriangle = 3;
                    System.out.println("3. - Equilateral triangle");
                }
            }
        }
        else { // false condition above
            if (zeroFound) { // negative input or 0
                System.out.println("0 -> Wrong input type. Only positive numbers.");
            }
            else {
                nonExistentTriangle = true;
            }
        }

        // Needed formulas:
        double p = (1.0 / 2) * (a + b + c); // half perimeter (P/2)
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Heron's formula for S

        if (nonExistentTriangle) {
            System.out.println("0 -> Not a triangle with these sides.");
        }
        else {
            if (typeTriangle == 1) {
                System.out.println("P = a + b + c" + " => " + "P = " + (a + b + c) + " cm");
                System.out.println("S = " + s + " cm2");
            }
            else {
                if (typeTriangle == 2) {
                    if (a == b) {
                        System.out.println("P = 2 * a + c [a = b]" + " => " + "P = " + (2 * a + c) + " cm");
                    }
                    else {
                        if (a == c) {
                            System.out.println("P = 2 * a + b [a = c]" + " => " + "P = " + (2 * a + b) + " cm");
                        }
                        else {
                            System.out.println("P = a + 2 * b [b = c]" + " => " + "P = " + (2 * b + a) + " cm");
                        }
                    }
                    System.out.println("S = " + s + " cm2");
                }
                else { // (typeTriangle == 3)
                        System.out.println("P = 3 * a [a = b = c]" + " => " + "P = " + 3 * a + " cm");
                        System.out.println("S = " + s + " cm2");
                }
            }
        }

    }
}
