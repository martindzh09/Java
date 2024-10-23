package _2_Loops;

import java.util.*;

public class _19_SumOfNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int num;
        int sum = 0;

        do {
            System.out.println("Input a number: ");
            num = kb.nextInt();

            sum += num;
        }
        while (num != 0);

        System.out.println("Sum of the numbers is: " + sum);

        kb.close();
    }
}
