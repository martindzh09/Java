package _6_Methods;

import java.util.*;

public class _01_FigureWithMethods {

    // Method I. Figure with '*'
    public static void figure(int n) {
        // operators included in the method's body
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Main method of the program
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Input 'm' for maximum elements: ");
        int m = kb.nextInt();

        // method I is called, code in its body is executed
        figure(m); // variable 'm' is set to the parameter

        /* Variable 'm' performs all the functionalities of the parameter
            set in the method's declaration. */

        kb.close();
    }
}
