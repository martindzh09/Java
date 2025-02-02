package _6_Methods;

import java.util.*;

public class _06_ArithmeticOperations {
	
	// Method 1 - Summing numbers
	public static double sum(double x, double y) {
		// value of sum is returned
		return (x + y);
	}
	
	// Method 2 - Difference
	public static double diff(double x, double y) {
		// value of difference is returned
		return (x - y);
	}
	
	// Method 3 - Multiplication
	public static double multi(double x, double y) {
		// value of multiplication is returned
		return (x * y);
	}
	
	// Method 4 - Division
	public static double division(double x, double y) {
		// value of division is returned
		return (x / y);
	}

	// Method 5 - Check for a zero divisor
	public static double zeroDivisor(double x) {
		Scanner scr = new Scanner(System.in);

		double y; // second number is assigned as a value to this variable

		if (x != 0) {
			do { // input 'y' till a positive number found (as a divisor)
				y = scr.nextDouble();

				if (y == 0) { // message when zero is input
					System.out.println("Cannot divide by zero!");
					System.out.println("\n" + "Input 'y' again: ");
				}
			} while (y == 0);
		}
		else { // when x = 0, 'y' could be any number
			y = scr.nextDouble();
		}

		return y;
	}
	
	// Method 6 - list of options
	public static void options() {
		System.out.println("\n" + "_________________ ");
		System.out.println("Options List:     |");
		System.out.println("----------------- |");
		System.out.println("                  |" );
		
		System.out.println("1. Sum            |");
		System.out.println("2. Difference     |");
		System.out.println("3. Multiplication |");
		System.out.println("4. Division       |");
		
		System.out.println("                  |");
		System.out.println("5. Exit           |");
		System.out.println("----------------- ");
	}

	// Method 7 - parentheses when negative number
	public static String parentheses(double y) {
		String valueY;

		if (y < 0) { // adding parentheses for negative numbers
			valueY = String.format("(%.2f)", y);
		}
		else { // no parentheses are added
			valueY = Double.toString(y);
		}

		return valueY; // value of 'y' is returned in String format
	}

	// Main method
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int choice;

		do {
			options(); // method 6 is called
			double x, y;

			System.out.println("\n" + "What is your choice?");
			choice = scr.nextInt();

			switch (choice) {
				case 1:
					System.out.println("\n" + "S U M");

					System.out.println("\n" + "Input a number 'x': ");
					x = scr.nextDouble();

					System.out.println("\n" + "Input another number 'y': ");
					y = scr.nextDouble();

					System.out.println("\n" + "Sum of numbers -> " +
							x + " + " + parentheses(y) + " = " + String.format("%.2f", sum(x, y)));
					break;

				case 2:
					System.out.println("\n" + "D I F F E R E N C E");

					System.out.println("\n" + "Input a number 'x': ");
					x = scr.nextDouble();

					System.out.println("\n" + "Input another number 'y': ");
					y = scr.nextDouble();

					System.out.println("\n" + "Difference of numbers -> " +
							x + " - " + parentheses(y) + " = " + String.format("%.2f", diff(x, y)));
					break;

				case 3:
					System.out.println("\n" + "M U L T I P L I C A T I O N");

					System.out.println("\n" + "Input a number 'x': ");
					x = scr.nextDouble();

					System.out.println("\n" + "Input another number 'y': ");
					y = scr.nextDouble();

					System.out.println("\n" + "Multiplication of numbers -> " +
							x + " * " + parentheses(y) + " = " + String.format("%.2f", multi(x, y)));
					break;

				case 4:
					System.out.println("\n" + "D I V I S I O N");

					System.out.println("\n" + "Input a number 'x': ");
					x = scr.nextDouble();

					System.out.println("\n" + "Input another number 'y': ");
					y = zeroDivisor(x);

					System.out.println("\n" + "Division of numbers -> " +
							x + " / " + parentheses(y) + " = " + String.format("%.2f", division(x, y)));
					break;

				default:
					if (choice != 5)
						System.out.println("Invalid option!");
			}
		} while (choice != 5);

		// the option to exit the program is typed in
		System.out.println("\n" + "Exiting the program... ");

		scr.close();
	}
}