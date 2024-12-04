package _4_Arrays;

import java.util.*;

public class _19_MyArrayOperations {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		// data for both rows and columns' size
		int n; // input from user
		
		do { // 0.0 size input check
			System.out.println("Input data 'n' for both rows and columns: ");
			n = kb.nextInt();
		}
		while (n <= 0);
		
		// 0.1 initializing needed 2D array
		double[][] myArray = new double[n][n];
		
		int i, j; // looping variables

		// Operation 1.0
		System.out.println("\n" + "1. Input data for elements in the array...");

		// 1.1 Input data for elements
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.println("Input float number data for element "
						+ "[" + i + "][" + j + "]: ");

				do { // 1.2 Additional check for elements
					myArray[i][j] = kb.nextDouble();

					// 1.3 Wrong input message
					if ((myArray[i][j] < - 10) || (myArray[i][j] > 10)) {
							System.out.println("* Number must be within range [-10; 10].");
							System.out.println("Input data for element [" + i + "][" + j + "]: ");
					}
				}
				while ((myArray[i][j] < -10) || (myArray[i][j] > 10));
			}
		}

		// Operation 2.0
		System.out.println();
		System.out.println("2. Your array consists of the following elements below: " + "\n");

		// 2.1 Printing in a matrix format
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.println();
		}

		// Operation 3.0
		System.out.println("\n" + "3. Sum of elements on each row");
		
		// 3.1 A parallel array collecting sum of elements on each row
		double[] sumRows = new double[n];
		
		// 3.2 Sum of elements on each row
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				sumRows[i] += myArray[i][j];
			}
		}
		
		// 3.3 Printing results
		for (i = 0; i < n; i++) {
			System.out.println("Sum of elements on row [" + i + "]: " + sumRows[i]);
		}

		// Operation 4.0
		System.out.println("\n" + "4. Sum of elements on the main diagonal");
		
		// 4.1 Variable to initialize sum of elements on the main diagonal
		double sumMain = 0.00;
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				// 4.2 Separation of elements on the main diagonal
				if (i == j) {
					sumMain += myArray[i][j];
				}
			}
		}
		// 4.3 Printing results
		System.out.println("=> Elements on the main diagonal summed up equal " + sumMain);

		// Operation 5.0
		System.out.println("\n" + "5. Multiplication of elements less than 5 "
				+ "and under the main diagonal");
		
		// 5.1 Multiplication of elements accepting conditions above
		double multi = 1.0;

		// 5.2 Times checked element doesn't accept conditions below
		int notFound = 0;
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				// 5.3 Nested conditions checking specific elements
				if (i > j) {
					if (myArray[i][j] < 5) {
						multi *= myArray[i][j];
					}
					else {
						notFound++;
					}
				}
			}
		}
		// 5.4 Printing results
		if (notFound == n) { // count of all unaccepted elements = n (max)
			System.out.println("=> * There are not any elements under the main " +
					"diagonal accepting conditions above.");
		}
		else {
			System.out.println("=> Result of multiplication of elements, "
					+ "accepting conditions above, equal " + multi);
		}

		kb.close();
	}
}
