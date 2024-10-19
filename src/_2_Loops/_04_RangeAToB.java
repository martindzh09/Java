package _2_Loops;

import java.util.*;

public class _04_RangeAToB {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a: ");
		int a = kb.nextInt(); // start
		
		System.out.println("Input b: ");
		int b = kb.nextInt(); // end
		
		if (a > 0 && b > 0 && a < b) { // a - start => a < b (b > a)
			for (int i = a; i <= b; i++) { // range between a and b (a and b included)
				System.out.println("i = " + i);
			}
		}
		else {
			System.out.println("Wrong input data!");
		}
			
		kb.close();
	}
}
