package _2_Loops;

import java.util.*;

public class _09_EvenNumbersToN {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = kb.nextInt(); // value for ending of loop

        int i = 2; // looping variable

        while (i < n) {
            System.out.println("i = " + i);
            // Each even number
            i += 2; // incremented by 2
        }

        kb.close();
    }
}
