package _2_Loops;

import java.util.*;

public class _20_InputNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int num;
        int product = 1;

        do {
            System.out.println("Input a number: ");
            num = kb.nextInt();

            product *= num;
        }
        while (num != 1);

        System.out.println("Product of multiplication of numbers is: " + product);
    }
}
