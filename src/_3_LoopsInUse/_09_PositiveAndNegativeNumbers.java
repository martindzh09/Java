package _3_LoopsInUse;

import java.util.*;

public class _09_PositiveAndNegativeNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int number;

        int positiveCounter = 0; // counter for positive numbers input
        int negativeCounter = 0; // counter for negative numbers input

        do {
            System.out.println("Input an Integer: ");
            number = kb.nextInt();

            if (number > 0) {
                positiveCounter++;
            }
            else {
                // additional condition to deny a case where input is 0
                if (number < 0) {
                    negativeCounter++;
                }
            }
        }
        while (number != 0);

        System.out.println("Count of positive numbers: " + positiveCounter);
        System.out.println("Count of negative numbers: " + negativeCounter);

        kb.close();
    }
}
