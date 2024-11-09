package _3_LoopsInUse;

import java.util.*;

public class _11_ValueOfFunction {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Function: [y = ax^2 + (6x - 6)^2 + 3]");

        System.out.println("Input data for 'a': ");
        int a = kb.nextInt(); // random input number

        for (int x = 10; x >= 5; x--) { // value of x decreases from 10 to 5
            // formula for 'y' function's value
            double y = a * Math.pow(x, 2) + (Math.pow(((6 * x) - 6), 2)) + 3;

            System.out.print("when x = " + x + "  =>" + "\t" + " y = " + y + "\n");
        }

        kb.close();
    }
}
