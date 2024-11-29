package _4_Arrays;

import java.util.*;

public class _18_SecondaryDiagonal {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n; // array's (matrix's) size

        do {
            System.out.println("Input data for rows and columns 'n': ");
            n = kb.nextInt();
        }
        while (n <= 0 || n > 100);

        int[][] matrix = new int[n][n];

        int i, j; // looping variables

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Input element [" + i + "][" + j + "]: ");
                matrix[i][j] = kb.nextInt();
            }
        }

        // sum of elements on and around the secondary diagonal
        int sumSec = 0; // (I.)
        int sumOver = 0; // (II.)
        int sumUnder = 0; // (III.)

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                // I.
                if ((i + j) == (n - 1)) {
                    sumSec += matrix[i][j];
                }
                // II.
                if ((i + j) < (n - 1)) {
                    sumOver += matrix[i][j];
                }
                // III.
                if ((i + j) > (n - 1)) {
                    sumUnder += matrix[i][j];
                }
            }
        }

        System.out.println("Your numbers in a matrix:" + "\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // printing results
        System.out.println("I. Sum of elements on the secondary diagonal is: " + sumSec);
        System.out.println("II. Sum of elements over the secondary diagonal is: " + sumOver);
        System.out.println("III. Sum of elements under the secondary diagonal is: " + sumUnder);

        kb.close();
    }
}
