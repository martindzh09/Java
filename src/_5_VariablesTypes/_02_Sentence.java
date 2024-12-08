package _5_VariablesTypes;

import java.io.IOException;

public class _02_Sentence {
    public static void main(String[] args) throws IOException {

        int symbolsCount = 0;
        int spacesCount = 0;

        char ch = ' ';

        System.out.println("Type in your sentence... ");

        while (ch != '.') {
            ch = (char) System.in.read();

            if (ch != ' ') {
                symbolsCount++;
            }
            else {
                spacesCount++;
            }
        }

        // Input '.' iterates once in the loop incrementing the value of symbols' count
        System.out.println("Symbols: " + (symbolsCount - 1));
        System.out.println("Spaces: " + spacesCount);

        // Count of words is spaces += 1; no space is left after end of the sentence
        System.out.println("Words: " + (spacesCount + 1));

    }
}
