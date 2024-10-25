package _2_Loops;

import java.util.*;

public class _25_SumDigits {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		int num = kb.nextInt();
		
		int saveNum = num;
		
		int sumDigits = 0;
		int digitsCount = 0;
		
		do {
			int digit = num % 10; // dividing by digits
			
			sumDigits += digit;
			digitsCount++; // counting for how many digits input number has
			
			num /= 10; // removing a digit
		}
		while (num != 0);
		
		System.out.println("Number " + saveNum + " has " + digitsCount + 
				" digits which sum is " + sumDigits);
		
		kb.close();
	}
}
