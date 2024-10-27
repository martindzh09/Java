package _3_LoopsInUse;

import java.util.*;

public class _02_NumbersRows {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = kb.nextInt(); // ending value for loops

        for (int i = 1; i <= n; i++) { // restriction for the rows
            for (int j = 1; j <= i; j++) { // restriction for count of numbers per a row
                System.out.print(j + " ");
            }
            System.out.println(); // new row after printing data for the previous one
        }

        kb.close();
    }
}
