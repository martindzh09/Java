package _2_Loops;

import java.util.*;

public class _07_ProductMultiplication {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input n: ");
		int n = kb.nextInt();
		
		int product = 1; // product of multiplication; e.g. 5 is the product of 1 * 5
		
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				product *= i;
				System.out.print(i);
				
				if (i == n) {
					System.out.print(" = ");
				}
				else {
				    System.out.print(" * ");
				}
			}
			
			System.out.print(product);
		}
		else {
			System.out.println("Wrong input data!");
		}
		
		kb.close();
	}
}
