package _3_LoopsInUse;

import java.util.*;

public class _03_NumberInOrder {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = kb.nextInt();

        for (int i = 1; i <= n; i++) { // rows' restriction
            for (int j = i; j < 2 * i; j++) { // j = from 1 to n; looping to twice j
                System.out.print(j + " "); //
            }
            System.out.println();
        }

        kb.close();
    }
}
