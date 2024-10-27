package _3_LoopsInUse;

import java.util.*;

public class _04_TaskF {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = kb.nextInt();

        double f = 0.0; // sum of y

        System.out.print("y = ");

        for (int i = 1; i <= n; i++) {
            double y = (double)(i) / (i + 1) * (i + 2); // formula from task
            f += y; // adding each 'y' value to the sum 'f'

            if (i == n) { // syntax when last collectable is reached
                System.out.print(y + " = ");
            }
            else { // when any another collectable
                System.out.print(y + " + ");
            }

        }
        System.out.print(f);

        kb.close();
    }
}
