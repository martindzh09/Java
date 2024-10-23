package _2_Loops;

import java.util.*;

public class _16_CountOfDigits {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = kb.nextInt();

        int countDigits = 1; // at least one digit
        boolean digits = true; // additional variable needed to break the loop

        while ((countDigits > 0) && (digits)) {

            int digit = num % 10; // separating number by digits
            countDigits++; // increments with each iteration of loop

            num /= 10; // removing each digit after checking it

            if (num == 0) { // ending the loop
                digits = false; // no losing the value of countDigits when breaking loop
            }

        }
        // It adds one more digit when first starting the loop
        countDigits--; // equaling the true value

        if (countDigits > 1) {
            System.out.println("Number consists of " + countDigits + " digits.");
        }
        else {
            System.out.println("Number consists of " + countDigits + " digit.");
        }

        kb.close();
    }
}



