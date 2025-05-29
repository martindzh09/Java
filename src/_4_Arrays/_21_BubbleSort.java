package _4_Arrays;

import java.util.*;

public class _21_BubbleSort {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input data for array's size: ");
        int n;

        do { // wrong size input check
            n = kb.nextInt();

            if ((n <= 0) || (n > 100)) {
                System.out.println("Wrong input data.");
                System.out.println("Input valid data for size: ");
            }
        } while ((n <= 0) || (n > 100));

        // declaring new double-type array sized to 'n'
        double[] array = new double[n];

        int i, j;

        for (i = 0; i < array.length; i++) {
            do {
                System.out.println("Input data for element [" + i + "]: ");
                array[i] = kb.nextDouble();
            } while ((array[i] < -500.0) || (array[i] > 500.0));
        }

        double tempValue; // needed when replacing values

        for (i = 0; i < n; i++) { // greatest element "floats up"
            // the greatest element on the position before the previous
            // greatest element on the last position

            // count of iterations decreases as the index of 'i' increases
            for (j = 1; j < (n - i); j++)

                // comparing two elements in a row
                if (array[j - 1] > array[j]) {
                    tempValue = array[j - 1]; // accepting value to temporary variable
                    array[j - 1] = array[j];
                    array[j] = tempValue; // value of temporary variable from above
                }
        }

        // Printing sorted array
        System.out.println("\n" + "After sorting elements -> ");

        for (i = 0; i < n; i++) {
            if ((n > 10) && (i % 10 == 0) && (i != 0)) {
                System.out.println();
            }

            System.out.print(array[i] + "\t");
        }

        System.out.println();

        kb.close();
    }
}