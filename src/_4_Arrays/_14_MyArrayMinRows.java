package _4_Arrays;

import java.util.*;

public class _14_MyArrayMinRows {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n, m; // sizes being assigned to 2D array
		
		do { // wrong input sizes check
			System.out.println("Input data for rows 'n': ");
			n = kb.nextInt();
			
			System.out.println("Input data for columns 'm': ");
			m = kb.nextInt();
		}
		while (n <= 0 || n > 100 || m <= 0 || m > 100);
		
		double[][] myArray = new double[n][m];
		
		int i, j; // looping variables
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				
				System.out.println("Input data for element [" + i + "][" + j + "]: ");
				myArray[i][j] = kb.nextDouble();
			}
		}
		
		// parallel 1D array - minimal value on the current row
		double[] minValue = new double[n];
		
		for (i = 0; i < n; i++) {
			// assigning first value to the minimal one
			minValue[i] = myArray[i][0];
			
			for (j = 0; j < m; j++) {
				
				// minimal value to be found
				if (myArray[i][j] < minValue[i]) {
					minValue[i] = myArray[i][j];
				}
			}
		}
		
		// printing results
		for (i = 0; i < n; i++) {
			System.out.println("Min value on row [" + i + "] is " + minValue[i]);
		}
		
		kb.close();
	}
}
