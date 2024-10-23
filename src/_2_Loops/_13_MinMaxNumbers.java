package _2_Loops;

import java.util.*;

public class _13_MinMaxNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = kb.nextInt();

        int min = num, max = num; // first set values changing in the loop

        while (num != 0) {
            System.out.println("Input a number: ");
            num = kb.nextInt(); // new input needed for a comparison with the first one

            if (num != 0) {
                if (num < min) { // min number
                    min = num;
                }
                else {
                    if (num > max) { // max number
                        max = num;
                    }
                }
            }
        }

        System.out.print("Min number is: " + min + "\n" + "Max number is: " + max);

        kb.close();
    }
}
