package _4_Arrays;

import java.util.*;

public class _20_SelectionSort {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input array's size data: ");
        int n;

        do { // wrong size input check
            n = kb.nextInt();

            if ((n <= 0) || (n > 50)) {
                System.out.println("Wrong input data.");
                System.out.println("Input valid data for size: ");
            }
        } while ((n <= 0) || (n > 50));

        // declaring new int-type array sized to 'n'
        int[] array = new int[n];

        // input data for elements of array
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.println("Input data for element [" + i + "]: ");
                array[i] = kb.nextInt();
            } while ((array[i] < - 1000) || (array[i] > 1000));
        }

        int minElement;
        int temporary; // needed when replacing with a greater value
        int index; // what position needed value is found on

        // 1.0 All elements are checked
        for (int i = 0; i < array.length; i++) {
            // 1.1 Main iterated element is set to the minimal
            minElement = array[i];
            index = i; // its position is accepted

            // 2.0 Nested loop needed for elements' comparison
            for (int j = i; j < array.length; j++) {
                // 2.1 Each of the elements is compared to the min value found
                if (minElement > array[j]) {
                    minElement = array[j]; // min value is changed to the new one found
                    index = j; // index of min value is marked
                }
            }

            // 3.0 Sorting elements - values replacement
            temporary = array[index];
            // 3.1 Position of min value is replaced with element currently iterated
            array[index] = array[i];
            // 3.2 Iterated position is taken by the min value found
            array[i] = temporary;
        }

        // Printing sorted array
        System.out.println("\n" + "After sorting elements -> ");

        for (int i = 0; i < n; i++) {
            if ((n > 10) && (i % 10 == 0) && (i != 0)) {
                System.out.println();
            }

            System.out.print(array[i] + "\t");
        }

        System.out.println();

        kb.close();
    }
}
