package _2_Loops;

import java.util.*;

public class _12_CountOfNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int num = kb.nextInt();

        int count = 0; // counter for all input numbers

        while (num != 0) { // condition for ending of loop
            count++; // incrementation by 1 for each iteration

            num = kb.nextInt(); // new input while true condition
        }

        System.out.println("Count of the numbers is: " + count);

        kb.close();
    }
}
