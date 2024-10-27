package _3_LoopsInUse;

import java.util.*;

public class _05_SumDigitsK {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input k: ");
        int k = kb.nextInt();

        int sumDigits = 0;

        for (int i = 100; i <= 999; i++) {
            sumDigits = i % 10;
            sumDigits += (i / 10) % 10;
            sumDigits += (i / 100) % 10;

            if (sumDigits == k) {
                System.out.print("i = " + i + "\t");
            }
        }

        kb.close();
    }
}
