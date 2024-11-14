package _4_Arrays;

import java.util.*;

public class _02_CounterOfElements {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n;

        do {
            System.out.println("Input data for n: ");
            n = kb.nextInt();
        }
        while (n <= 0 || n > 100);

        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input an element for array: ");
            array[i] = kb.nextDouble();
        }

        int count = 0; // * counter for negative numbers

        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        System.out.println("Count of negative numbers in the array is: " + count);

        kb.close();
    }
}
