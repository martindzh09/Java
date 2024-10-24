package _2_Loops;

import java.util.*;

public class _21_CountNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int count = 0, num;

        do {
            System.out.println("Input a number: ");
            num = kb.nextInt();

            count++; // counter +=1 when number is input
        }
        while (num != 0);

        System.out.println("Count of input numbers is " + count);

        kb.close();
    }
}
