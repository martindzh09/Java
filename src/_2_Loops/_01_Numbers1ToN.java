package _2_Loops;

import java.util.*;

public class _01_Numbers1ToN {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = kb.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.println("i = " + i);
            }
        }
        else {
            System.out.println("Error!");
        }

        kb.close();
    }
}
