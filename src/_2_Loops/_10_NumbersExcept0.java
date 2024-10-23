package _2_Loops;

import java.util.*;

public class _10_NumbersExcept0 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = kb.nextInt();

        int sumNumbers = 0; // a variable used after the loop as well as in it

        while (number != 0) { // true when input number is different from 0
            sumNumbers += number; // sum when first scanned

            number = kb.nextInt(); // 2nd input -> (1st out of the loop)
        }

        System.out.println("Sum of the numbers is: " + sumNumbers);

        kb.close();
    }
}
