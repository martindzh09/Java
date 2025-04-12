package _4_Arrays;

import java.util.Scanner;

public class _23_ElementsInArray_Part2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("\n" + "----------------------------------------------------");
        System.out.println("I. How many numbers would you like to save in array?");
        int n;

        do {
            n = scr.nextInt();

            if (n <= 0) {
                System.out.println("\n" + "-----------------------------------");
                System.out.println("Invalid data for count of elements!");

                System.out.println("\n" + "Input again: ");
            }
        } while (n <= 0);

        // an array numbers are saved in
        double[] array = new double[n];

        System.out.println("\n" + "---------------------------------------");
        System.out.println("II. Input data for numbers in the array");

        for (int i = 0; i < n; i++) {
            System.out.println("\n" + "Data for element [" + i + "]: ");
            array[i] = scr.nextDouble();
        }

        System.out.println("\n" + "-----------------------------");
        System.out.println("III. Printing array's data... ");

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            }
            else {
                if (!(i == n - 1)) {
                    System.out.print(array[i] + ", ");
                }
                else {
                    System.out.print(array[i] + "]");
                }
            }
        }

        System.out.println();
        System.out.println("\n" + "-----------------------------");
        System.out.println("IV. Sum of elements on even indexes");

        double sumEvenIndexes = 0.00;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEvenIndexes += array[i];
            }
        }

        // printing the sum of elements on even indexes (odd positions)
        System.out.println("Sum of elements on even indexes -> " + sumEvenIndexes);

        scr.close();
    }
}