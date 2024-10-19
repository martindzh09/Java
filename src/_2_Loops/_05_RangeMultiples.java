package _2_Loops;

import java.util.*;

public class _05_RangeMultiples {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a (for start)... ");
        int a = kb.nextInt(); // start of range

        System.out.println("Input b (for end)... ");
        int b = kb.nextInt();

        System.out.println("Input x variable: ");
        int x = kb.nextInt();

        if (a > 0 && b > 0 && a < b && x > 0) {
            for (int i = a; i <= b; i++) {
                if (i % x == 0) { // multiples of input variable (x)
                    System.out.println(i + " is a multiple of x = " + x);
                }
            }
        }
        else {
            System.out.println("Error! Only positive integer data.");
        }

        kb.close();
    }
}
