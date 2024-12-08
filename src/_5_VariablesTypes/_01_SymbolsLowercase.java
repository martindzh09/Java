package _5_VariablesTypes;

public class _01_SymbolsLowercase {
    public static void main(String[] args) {

        // 1. Printing symbols 65 to 90
        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();

        // 2. Symbols after set to their lower case
        char newSymbol;

        for (int i = 65; i <= 90; i++) {
            newSymbol = Character.toLowerCase((char)i);
            System.out.print(newSymbol + " ");
        }

    }
}
