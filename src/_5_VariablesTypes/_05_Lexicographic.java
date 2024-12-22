package _5_VariablesTypes;

import java.util.*;

public class _05_Lexicographic {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a word: ");
        String word = kb.nextLine();

        System.out.println("Input one more word: ");
        String word2 = kb.nextLine();

        // lexicographic comparison operator
        if (word.compareTo(word2) < 0) {
            // negative difference in alphabetic order -> word 1, word 2, etc.
            System.out.println("\n" + "Word 1 < Word 2");
        }
        else {
            if (word.compareTo(word2) > 0) {
                // positive difference in alphabetic order -> word 2, word 1, etc.
                System.out.println("\n" + "Word 1 > Word 2");
            }
            else {
                System.out.println("\n" + "Words are the same (Word 1 = Word 2)");
            }
        }

        kb.close();
    }
}
