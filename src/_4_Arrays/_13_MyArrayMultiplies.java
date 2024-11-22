package _4_Arrays;

import java.util.*;

public class _13_MyArrayMultiplies {

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
		
		int r, c; // looping variables
		
		for (r = 0; r < n; r++) {
			for (c = 0; c < m; c++) {
				
				System.out.println("Input data for element [" + r + "][" + c + "]: ");
				myArray[r][c] = kb.nextDouble();
			}
		}
		
		// sum of all elements multiplies of 5
		double sumMultiplies = 0;
		
		for (r = 0; r < n; r++) {
			for (c = 0; c < m; c++) {
				
				// multiplies of 5
				if (myArray[r][c] % 5 == 0) {
					sumMultiplies += myArray[r][c];
				}
			}
		}
		
		System.out.println("Sum of multiplies of 5 found as elements is " + sumMultiplies);
		
		kb.close();
	}
}
