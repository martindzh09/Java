package _5_VariablesTypes;

import java.util.*;

public class _06_NameSubstring {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Type in your first and last name... ");
        String name = kb.nextLine();

        int spaceIndex = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                spaceIndex = i; // needed to separate first from last name
            }
        }

        // extraction of substring in index range [0; spaceIndex)
        String firstName = name.substring(0, spaceIndex);
        System.out.println("First name: " + firstName);

        // extraction of substring in index range [spaceIndex + 1; end]
        String lastName = name.substring(spaceIndex + 1);
        System.out.println("Last name: " + lastName);

        kb.close();
    }
}
