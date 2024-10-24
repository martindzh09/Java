package _2_Loops;

import java.util.*;

public class _23_PositiveNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int num;
        int countPositive = 0;

        do {
            System.out.println("Input a number: ");
            num = kb.nextInt();

            if (num > 0) {
                countPositive++;
            }
        }
        while (countPositive < 3);

        System.out.println("You entered 3 positive numbers!");

        kb.close();
    }
}
