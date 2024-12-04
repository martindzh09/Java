package _4_Arrays;

import java.util.*;

public class _10_ArrayConditions_Part1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n; // array's size

        do {
            System.out.println("Input size 'n': ");
            n = kb.nextInt();
        }
        while (n <= 0 || n > 100);

        int i; // looping variable

        double[] array = new double[n];

        // input data for elements
        for (i = 0; i < n; i++) {
            System.out.println("Input data for element [" + i + "]: ");
            array[i] = kb.nextDouble();
        }

        double multipliedElements = 1;
        int positiveCounter = 0;
        double sumEvenPosition = 0;

        // variable to be found
        System.out.println("Input number 'x': ");
        double x = kb.nextDouble(); // input for 'x'

        int xFound = 0;

        double minElement = array[0];
        int indexMinElement = 0;

        for (i = 0; i < n; i++) {
            // I. All elements multiplied
            multipliedElements *= array[i];

            // II. Count of positive numbers
            if (array[i] > 0) {
                positiveCounter++;
            }

            // III. Sum of elements on even position (index)
            if (i % 2 == 0) {
                sumEvenPosition += array[i];
            }

            // IV. How many times 'x' is found in the array
            if (array[i] == x) {
                xFound++;
            }

            // V. Min element found
            if (array[i] < minElement) {
                minElement = array[i];
                indexMinElement = i;
            }
        }

        System.out.println("I. All elements multiplied: " + multipliedElements);
        System.out.println("II. Count of positive elements: " + positiveCounter);
        System.out.println("III. Sum of elements on even positions: " + sumEvenPosition);
        System.out.println("IV. Number x = " + x + " is found " + xFound + " times.");
        System.out.println("V. Min element found is " + minElement + ", index [" + indexMinElement + "]");

        kb.close();
    }
}
