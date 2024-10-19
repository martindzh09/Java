package _2_Loops;

import java.util.*;

public class _03_EvenNumbers {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = kb.nextInt(); // positive data required

        if (n > 0) {
            for (int i = 2; i < n; i += 2) {
                System.out.println("i = " + i);
            }
        }
        else {
            System.out.println("Wrong input data!");
        }

        kb.close();
    }
}
