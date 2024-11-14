package _4_Arrays;

import java.util.*;

public class _01_ArithmeticOperations {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n; // array's limit (size)

        do {
            System.out.println("Input array's limit 'n': ");
            n = kb.nextInt();
        }
        while (n <= 0 || n > 100);

        double[] array = new double[n]; // declaring an array

        // input elements in the array
        for (int i = 0; i < n; i++) {
            System.out.println("Input an element from array: ");
            array[i] = kb.nextDouble();
        }
        System.out.println("Elements included in the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("Operation [*2]");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] *= 2);
        }

        kb.close();
    }
}
