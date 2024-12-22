package _5_VariablesTypes;

import java.util.*; import java.io.IOException;

public class _04_Words {
    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a word: ");
        String word = kb.nextLine();

        System.out.println("Input another word: ");
        String word2 = kb.nextLine();

        System.out.println("\n" + "Words: " + word + ", " + word2);

        System.out.println("\n" + "Choose an option for words.");
        System.out.println("A. To lowercase letters" + "\n" + "B. To uppercase letters");


        char option;

        do {
            option = (char) System.in.read();

            if ((option != 'A') && (option != 'B')) {
                System.out.println("Non-available option.");
                option = (char) System.in.read();
            }
        }
        while ((option != 'A') && (option != 'B'));

        switch (option) {
            case 'A':
                // to Lowercase letters
                word = word.toLowerCase();
                word2 = word2.toLowerCase();
                break;

            case 'B':
                // to Uppercase letters
                word = word.toUpperCase();
                word2 = word2.toUpperCase();
                break;
        }

        System.out.println("\n" + "Transformed words: " + word + ", " + word2);

        kb.close();
    }
}
