package _4_Arrays;

import java.util.*;

public class _17_MainDiagonal {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n; // matrix's size

        do {
            System.out.println("| QUADRATIC MATRIX |" + "\n" + "Input data for both rows and columns: ");
            n = kb.nextInt(); // rows = columns in a quadratic matrix
        }
        while (n <= 0 || n > 100);

        // A quadratic matrix - 2D matrix
        int[][] matrix = new int[n][n];

        int i, j; // looping variables

        for (i = 0; i < n; i++) {
            for (j = 0;j < n; j++) {
                System.out.println("Input element [" + i + "][" + j + "]: ");
                matrix[i][j] = kb.nextInt();
            }
        }

        // sum of elements on the main diagonal
        int sumDiagonal = 0; // (I.)
        int sumOverDiagonal = 0; // (II.)
        int sumUnderDiagonal = 0; // (III.)

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                // I.
                if (i == j) {
                    sumDiagonal += matrix[i][j];
                }
                // II.
                if (i < j) {
                    sumOverDiagonal += matrix[i][j];
                }
                // III.
                if (i > j) {
                    sumUnderDiagonal += matrix[i][j];
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
        System.out.println("I. Sum of elements on the main diagonal is: " + sumDiagonal);
        System.out.println("II. Sum of elements over the main diagonal is: " + sumOverDiagonal);
        System.out.println("III. Sum of elements under the main diagonal is: " + sumUnderDiagonal);

        kb.close();
    }
}
