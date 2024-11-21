package _4_Arrays;

import java.util.*;

public class _11_ArrayConditions_Part_2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n; // array's size

        do {
            System.out.println("Input size 'n': ");
            n = kb.nextInt();
        }
        while (n <= 0 || n > 100);

        int[] array = new int[n];

        int i; // looping variable

        for (i = 0; i < n; i++) {
            System.out.println("Input an integer for an element: ");
            array[i] = kb.nextInt();
        }

        int countMultiplies3 = 0;
        int positivesMultiplied = 1;

        // random number input
        System.out.println("Input number 'x': ");
        double x = kb.nextDouble();
        int countGreaterX = 0;

        int maxElement = array[0];
        int indexMax = 0;

        int sumElements = 0;

        for (i = 0; i < n; i++) {
            // I. Multiples of 3
            if (array[i] % 3 == 0) {
                countMultiplies3++;
            }

            // II. Multiplication of all positive elements
            if (array[i] > 0) {
                positivesMultiplied *= array[i];
            }

            // III. Count of elements greater than 'x'
            if (array[i] > x) {
                countGreaterX++;
            }

            // IV. Max element and its index
            if (array[i] > maxElement) {
                maxElement = array[i];
                indexMax = i;
            }

            // V. Sum of all elements
            sumElements += array[i];
        }

        System.out.println("I. Count of multiplies of 3: " + countMultiplies3);
        System.out.println("II. All positive elements multiplied: " + positivesMultiplied);
        System.out.println("III. Count of elements greater than 'x': " + countGreaterX);
        System.out.println("IV. Max element found is " + maxElement + ", index [" + indexMax + "].");
        System.out.println("V. Sum of all elements: " + sumElements);

        kb.close();
    }
}
