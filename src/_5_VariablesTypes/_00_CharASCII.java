package _5_VariablesTypes;

import java.io.IOException;

public class _00_CharASCII {
    public static void main(String[] args) throws IOException {

        // I. initializing new variable of 'character' type
        char letter = 'd';

        int num = 66; // number in ASCII table

        // char to int
        System.out.println("Character " + "'" + letter + "'" + " in ASCII -> " + (int)letter);

        // int to char
        System.out.println("ASCII code " + num + " in 'char' type -> " + (char)num);

        // II. Arithmetic operations
        char a = 'A';
        int x = 1;
        int y = x + a;

        System.out.println("\n" + "[y = x + (int)a] => y = " + y);

        char b = 'H';
        char c = (char)(b + 32);

        System.out.println("[c = (char)((int)b + 32)] -> c = " + c);

    }
}
