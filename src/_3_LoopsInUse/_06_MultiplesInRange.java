package _3_LoopsInUse;

import java.util.Scanner;

public class _06_MultiplesInRange {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int m, n;

        do { // needed to check all available incorrect inputs
            System.out.println("Input m: ");
            m = kb.nextInt();

            System.out.println("Input n: ");
            n = kb.nextInt();
        }
        while ((m <= 0) || (n <= 0) || (m >= n)); // cannot break the loop when data input is wrong

        for (int i = m; i <= n; i++) { // range from m to n
            if (i % 5 == 0) { // condition for multiples of 5
                System.out.println(i + " is a multiple of 5");
            }
        }

        kb.close();
    }
}
