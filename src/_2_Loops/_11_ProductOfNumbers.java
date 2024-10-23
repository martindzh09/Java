package _2_Loops;

import java.util.*;

public class _11_ProductOfNumbers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int num = kb.nextInt();

        int product = 1; // anything multiplied by zero equals 0

        while (num != 1) {
            product *= num; //

            num = kb.nextInt(); // acceptance for new input of variable 'num' (if true condition above)
        }

        System.out.println("Product of all numbers is: " + product);

        kb.close();
    }
}
