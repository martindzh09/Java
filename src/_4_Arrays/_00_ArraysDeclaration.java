package _4_Arrays;

import java.util.*;

public class _00_ArraysDeclaration {
    public static void main(String[] args) {

        // Declaration of one-dimensional arrays in Java
        int[] array1 = new int[5]; // 5 elements included []
        double[] array2 = new double[] {2.5, 3.5, 4.8, 10.2}; // specified elements included

        // Input data for array1
        Scanner kb = new Scanner(System.in);
        // iterating till values are assigned for each position (index)
        for (int i = 0; i < 5; i++) {
            System.out.println("Input an element for array1: ");
            array1[i] = kb.nextInt();
        }

        // Printing arrays' data

        for (int i = 0; i < 5; i++) {
            System.out.println("An element from array1: " + array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("An element from array2: " + array2[i]);
        }

        kb.close();
    }
}
