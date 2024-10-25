package _2_Loops;

import java.util.*;

public class _26_SumMirrorNumber {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		int num = kb.nextInt();
		
		int saveNum = num; // it changes through the loop
		
		int mirrorNum = 0;
		
		do {
			mirrorNum = mirrorNum * 10 + (num % 10);
			
			num /= 10; // removing a digit
		}
		while (num != 0);
		
		System.out.println("Sum of " + saveNum + " and its mirror number " + 
				"(" + mirrorNum + ") is " + (saveNum + mirrorNum));   
		
		
		kb.close();
	}
}
