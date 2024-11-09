package _3_LoopsInUse;

import java.util.*;

public class _10_MathEquationZ {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double n; // to be input

        double z; // variable storing the value of Z (the equation)

        do {
            System.out.println("Input n: ");
            n = kb.nextDouble(); // part of collectable of equation Z
        }
        while (n <= 0);

        // Z's value Formula:
        z = (1.0 / (Math.pow(1, 2))) * (1.0 / (Math.pow(2, 2))) *
                (1.0 / (Math.pow(3, 2))) * (1.0 / (Math.pow(n, 2)));

        System.out.println("Z = " + z);

        kb.close();
    }
}
