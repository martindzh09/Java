package _2_Loops;

import java.util.Scanner;

public class _02_SumNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int i, n, sum = 0;

        System.out.println("Input n: ");
        n = kb.nextInt();

        if (n > 0) {
            for (i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("sum = " + sum);
        }
        else {
            System.out.println("!!n<=0!! Error");
        }

        kb.close();
    }
}
