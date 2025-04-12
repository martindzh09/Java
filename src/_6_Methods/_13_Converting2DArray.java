package _6_Methods;

import java.util.Scanner;

public class _13_Converting2DArray {

    // Method 1 - Converting 2D array into 1D array
    public static double[] convertingToArray(double[][] twoDArray) {
        // new one-dimensional array collecting the elements from the two-dimensional one
        double[] array = new double[twoDArray.length * twoDArray[0].length];

        for (int i = 0; i < array.length;) {
            for (double[] doubles : twoDArray) {
                for (int k = 0; k < twoDArray[0].length; k++) {
                    array[i] = doubles[k];
                    i++;
                }
            }
        }

        System.out.println("\n" + "---------------------------------------");
        System.out.println("V. Printing data of the new 1D array... ");

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            }
            else {
                if (!(i == array.length - 1)) {
                    System.out.print(array[i] + ", ");
                }
                else {
                    System.out.print(array[i] + "]");
                }
            }
        }

        return array;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("\n" + "I. Input data for length of a 2D array: ");
        int m; // length

        do {
            m = scr.nextInt();

            if (m <= 0) {
                System.out.println("\n" + "Invalid data for length!");
                System.out.println("Input again: ");
            }
        } while (m <= 0);

        System.out.println("\n" + "II. Input data for width of a 2D array: ");
        int n; // width

        do {
            n = scr.nextInt();

            if (n <= 0) {
                System.out.println("\n" + "Invalid data for width!");
                System.out.println("Input again: ");
            }
        } while (n <= 0);

        System.out.println("\n" + "-------------------------------");
        System.out.println("III. Input data in the 2D array");

        // saving elements in a two-dimensional array
        double[][] A = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("\n" + "Input data for element [" + i + "][" + j + "]: ");
                A[i][j] = scr.nextDouble();
            }
        }

        System.out.println("\n" + "--------------------------------");
        System.out.println("IV. Printing data of 2D array... ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        double[] convertedArray = convertingToArray(A); // method 1 is called

        System.out.println("\n\n" + "* Count of elements in the array -> " + convertedArray.length);

        scr.close();
    }
}