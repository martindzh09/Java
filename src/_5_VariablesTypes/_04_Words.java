package _5_VariablesTypes;

import java.util.*;

public class _04_Words {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a word: ");
        String word = kb.nextLine();

        System.out.println("\n" + "Input another word: ");
        String word2 = kb.nextLine();

        // a message to visualize the words typed in above
        System.out.println("\n" + "Words: " + word + ", " + word2);

        // list of two options is printed
        System.out.println("\n" + "Choose an option for words.");
        System.out.println("A. To lowercase letters" + "\n" + "B. To uppercase letters");

        String option; // one of the letters 'A' or 'B', of the options above

        do { // different/wrong option input check
            System.out.print("\n"); option = kb.nextLine();

            if (!option.equals("A") && !option.equals("B")) {
                System.out.println("Non-available option.");
            }
        } while (!option.equals("A") && !option.equals("B"));

        switch (option) {
            case "A": // to Lowercase letters
                word = word.toLowerCase();
                word2 = word2.toLowerCase();
                break;

            case "B": // to Uppercase letters
                word = word.toUpperCase();
                word2 = word2.toUpperCase();
                break;
        }

        // printing transformed words
        System.out.println("\n" + "Transformed words: " + word + ", " + word2);

        kb.close();
    }
}
