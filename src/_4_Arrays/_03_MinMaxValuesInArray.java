package _4_Arrays;

import java.util.*;

public class _03_MinMaxValuesInArray {
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
            System.out.println("Input an element in array: ");
            array[i] = kb.nextDouble();
        }
        // first value in the array is automatically both max and min value
        double min = array[0], max = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        kb.close();
    }
}
