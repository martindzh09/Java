package _2_Loops;

import java.util.*;

public class _24_ReverseNumber {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a number...");
		int num = kb.nextInt();
		
		int saveNum = num; // keeping the first set value
		
		int result = 0; // needed when changing within the loop
		
		boolean zeroLastDigit = saveNum % 10 == 0;
		
		int zeroCounter = 0;
		
		do {
			if (num != 0) {
				
				int digit = num % 10; // divided by digits from right to left
				
				result = result * 10 + digit; // moving each digit with a position on right
				
				if (result == 0) {
					zeroCounter++;
				}
				
				// System.out.print(digit); // printing each digit with each iteration of loop
				
				num /= 10; // removing the digit already used
			}
		}
		while (num != 0);
		
		if (zeroLastDigit) {
			
			switch (zeroCounter) { // needed to print all zeros 
				case 1:
					System.out.println("Number " + saveNum + " written from right to left is " + "0" + result);
					break;
					
				case 2: 
					System.out.println("Number " + saveNum + " written from right to left is " + "00" + result);
					break;
					
				case 3: 
					System.out.println("Number " + saveNum + " written from right to left is " + "000" + result);
					break;
					
				case 4: 
					System.out.println("Number " + saveNum + " written from right to left is " + "0000" + result);
					break;
					
				case 5: 
					System.out.println("Number " + saveNum + " written from right to left is " + "00000" + result);
					break;
					
				case 6: 
					System.out.println("Number " + saveNum + " written from right to left is " + "000000" + result);
					break;

				case 7: 
					System.out.println("Number " + saveNum + " written from right to left is " + "0000000" + result);
					break;

				case 8: 
					System.out.println("Number " + saveNum + " written from right to left is " + "00000000" + result);
					break;

				case 9: 
					System.out.println("Number " + saveNum + " written from right to left is " + "000000000" + result);
					break;
			}
		}
		else {
			System.out.println("Number " + saveNum + " written from right to left is " + result);
		}
		
		kb.close();
	}
}
