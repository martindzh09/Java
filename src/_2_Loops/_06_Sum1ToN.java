package _2_Loops;

import java.util.*;

public class _06_Sum1ToN {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input n: ");
		int n = kb.nextInt();
		
		int sum = 0;
		
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			
			System.out.println("sum = " + sum);
		}
		else {
			System.out.println("Error!");
		}
		
		kb.close();
	}
}
