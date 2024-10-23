package _2_Loops;

import java.util.Scanner;

public class _15_SumOfDigits {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = kb.nextInt();

        int sumDigits = 0;

        while (num != 0) {
            int digit = num % 10;

            sumDigits += digit;

            num /= 10; // removing the last digit with each iteration
        }

        System.out.println("Sum of the digits is: " + sumDigits);

        kb.close();
    }
}
