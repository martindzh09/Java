package _2_Loops;

import java.util.Scanner;

public class _08_SumNumbers1ToN {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = kb.nextInt(); // input num (end of the loop)
        int i = 1;

        int sum = 0;

        while (i <= n) {
            sum += i;
            System.out.println("i = " + i);

            i++; // actualization of the "looping" variable
        }

        System.out.println("sum = " + sum);

        kb.close();
    }
}
