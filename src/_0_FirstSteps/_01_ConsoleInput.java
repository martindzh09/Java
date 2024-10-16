package _0_FirstSteps;

import java.util.*;

public class _01_ConsoleInput {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int i = kb.nextInt();
        int j = kb.nextInt();

        System.out.println("min-> " + Math.min(i, j));

        double x = kb.nextDouble();
        double y = kb.nextDouble();

        System.out.println("abs-> " + Math.abs(x));
        System.out.println("abs-> " + Math.abs(y));

        System.out.println("max-> " + Math.max(x, y));
        System.out.println("square root -> " + Math.sqrt(x));

        double p = Math.sqrt(y);
        System.out.println("p = sqrt(y)-> " + p);

        double k = Math.pow(i, j);
        System.out.println("k = pow(i, j)-> " + k);

    }
}
