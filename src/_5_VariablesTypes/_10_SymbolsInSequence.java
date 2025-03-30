package _5_VariablesTypes;

import java.util.Scanner;

public class _10_SymbolsInSequence {
	
	// Method 1 - Data for string
	static String dataSymbols() {
		Scanner scr1 = new Scanner(System.in);
		
		System.out.println("\n" + "Input symbols... ");

        return scr1.nextLine();
	}
	
	// Method 2 - Counting three same symbols in order
	static int countSymbolsInSequence(String text) {
		int symbolsInSequence = 0;
		
		for (int i = 0; i < text.length(); i++) {
			
			if (i + 3 < text.length()) {
				if (text.charAt(i) == text.charAt(i + 1) && text.charAt(i) == text.charAt(i + 2) && 
						text.charAt(i + 1) == text.charAt(i + 2)) {
					
					symbolsInSequence++; // three same (equal) symbols are found within the string
					
					// avoiding counting more than 3 same symbols in sequence as one more same three
					i += 2;
				}
			}
		}
		
		return symbolsInSequence;
	}
	
	// Main method
	public static void main(String[] args) {
		String textSymbols = dataSymbols(); // method 1 is called
		
		int countSymbolsInSequence = countSymbolsInSequence(textSymbols);
		
		if (countSymbolsInSequence == 0) {
			System.out.println("\n" + "* There is not a three of same symbols found within the list");
		}
		
		else {
			if (countSymbolsInSequence > 1) {
				System.out.println("\n" + countSymbolsInSequence + " is the count of "
						+ "threes of same symbols found within the string");
			}
			else {
				System.out.println("\n" + countSymbolsInSequence + " three of same "
						+ "symbols is found within the string");
			}
		}
	}
}