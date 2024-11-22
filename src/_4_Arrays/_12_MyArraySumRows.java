package _4_Arrays;

import java.util.*;

public class _12_MyArraySumRows {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n, m; // array's sizes
		
		do { // wrong input sizes check
			System.out.println("Input data for rows 'n': ");
			n = kb.nextInt();
			
			System.out.println("Input data for columns 'm': ");
			m = kb.nextInt();
		}
		while (n <= 0 || n > 100 || m <= 0 || m > 100);
		
		// declaring main 2D array
		double[][] myArray = new double[n][m];
		
		int i, j; // looping variables
		
		// assigning input values to the array
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				
				System.out.println("Input data for element [" + i + "][" + j + "]: ");
				myArray[i][j] = kb.nextDouble();
			}
		}
		
		// parallel 1D array - sum of elements on each row of 'myArray'
		double[] sumRow = new double[n];
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				
				sumRow[i] += myArray[i][j];
			}
		}
		
		// printing results
		for (i = 0; i < n; i++) {
			System.out.println("Sum of elements on row [" + i + "] = " + sumRow[i]);
		}
		
		kb.close();
	}
}
