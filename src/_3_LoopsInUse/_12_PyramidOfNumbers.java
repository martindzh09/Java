package _3_LoopsInUse;

import java.util.*;

public class _12_PyramidOfNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n;

        do { // wrong input check
            System.out.println("Input n: ");
            n = kb.nextInt();
        }
        while (n <= 0);

        // a variable needed to keep numbers increasing after each row
        int currentNum = 1;

        for (int r = 1; r <= n; r++) { // rows depending on value of 'n'
            for (int s = n; s > r; s--) { // intervals/spaces  depending on current value of 'i'
                System.out.print(" "); // printing intervals from 'n' to current row number

                /* Value of 'i' increases in each iteration of the main loop
                   => count of spaces decreases, more numbers fill in the "gaps"
                        left for the pyramid's bases. */
            }
            // count of printed number is equalized to the number of current row
            for (int c = 1; c <= r; c++) {
                System.out.print(currentNum + " "); // leaving a space between numbers
                currentNum++; // printing the number reached after all iterations above
            }

            System.out.println(); // new line for the next "floor" of the pyramid
        }

        kb.close();
    }
}
