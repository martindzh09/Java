package _5_VariablesTypes;

import java.util.*;

public class _AddTask_HiddenPassword {
	public static void main (String[] args) {

		Scanner kb = new Scanner(System.in);

		// Program upper border, title line
		System.out.println("\n" + "| Hidden Password Generator |");

		// Message for user's input below
		System.out.print("\n" + "Type in your password... ");

		String password;

		do { // Password's length limit check
			password = kb.next();

			if (password.length() > 15) { // upper limit of symbols
				System.out.println("Your password is too long! (up to 15 symbols)");
				System.out.print("\n" + "Type in another password... "); // retyping
			}

			if (password.length() < 6) { // lower limit of symbols
				System.out.println("Your password is not long enough! (at least 6 symbols)");
				System.out.print("\n" + "Type in another password... "); // retyping
			}
		}
		while ((password.length() > 15) || (password.length() < 6));

		System.out.print("Your hidden password is: ");

		// Separating and printing each symbol's number data
		for (int i = 0; i < password.length(); i++) {
			System.out.print((int)(password.charAt(i)));
		}

		System.out.println();

		kb.close();
	}
}
