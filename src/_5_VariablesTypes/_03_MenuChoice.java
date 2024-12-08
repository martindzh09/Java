package _5_VariablesTypes;

import java.io.IOException;

public class _03_MenuChoice {
    public static void main(String[] args) throws IOException {

        // Given menu:
        System.out.println("| MENU |");

        System.out.println("A. Department 1");
        System.out.println("B. Department 2");
        System.out.println("C. Department 3");

        System.out.println("\n" + "Which department are you a member of?");

        char answer;
        answer = (char) System.in.read();

        switch (answer) {
            case 'A':
                System.out.println("Your answer is " + answer + ", so Department 1.");
                System.out.println("Your meeting is at 13:00.");
                break;

            case 'B':
                System.out.println("Your answer is " + answer + ", so Department 2.");
                System.out.println("Your meeting is at 15:00.");
                break;

            case 'C':
                System.out.println("Your answer is " + answer + ", so Department 3.");
                System.out.println("Your meeting is at 10:00.");
                break;

            default:
                System.out.println("Not an existing department!");
        }

    }
}
