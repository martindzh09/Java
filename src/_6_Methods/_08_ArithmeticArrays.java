package _6_Methods;

import java.util.Scanner;

public class _08_ArithmeticArrays {

    // Method I - List of options (shown to the user)
    public static void optionsList() {
        System.out.println("\n" + "_________________ ");
        System.out.println("Options List:     |");
        System.out.println("----------------- |");
        System.out.println("                  |" );

        System.out.println("1. Sum            |");
        System.out.println("2. Difference     |");
        System.out.println("3. Multiplication |");
        System.out.println("4. Division       |");

        System.out.println("                  |");
        System.out.println("5. Exit           |");
        System.out.println("----------------- ");
    }

    // Method II - Sum of arrays (+)
    public static void sumArrays(double[] a, double[] b, double[] sumArray) {
        int m = a.length; // or 'm = b.length'

        for (int i = 0; i < m; i++) {
            sumArray[i] = a[i] + b[i]; // summing elements from different arrays
            System.out.println("Element [" + i + "] = " + a[i] + " + " + b[i] + " = " +
                    String.format("%.2f", sumArray[i]));
        }
    }

    // Method III - Difference of arrays (-)
    public static double[] diffArrays(double[] a, double[] b) {
        double[] diffArray = new double[a.length]; // or '[b.length]'

        for (int i = 0; i < a.length; i++) {
            diffArray[i] = a[i] - b[i];
        }

        return diffArray; // whole data of the array is returned
    }

    // Method IV - Multiplication of arrays (*)
    public static double[] multiArrays(double[] a, double[] b) {
        double[] multiArray = new double[a.length]; // or '[b.length]'

        for (int i = 0; i < a.length; i++) {
            multiArray[i] = a[i] * b[i];
        }

        return multiArray; // whole data of the array is returned
    }

    // Method V - Division of arrays (/)
    public static double[] divArrays(double[] a, double[] b) {
        double[] divArray = new double[a.length]; // or '[b.length]'

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) { // additional statements for zero divisor
                if (b[i] != 0) {
                    divArray[i] = a[i] / b[i];
                }
                else {
                    System.out.println("Cannot divide by zero! \n" +
                            "* Element [" + i + "] is set value 0");

                    divArray[i] = 0; // elements is assigned value 0
                }
            }
            else {
                divArray[i] = a[i] / b[i];
            }
        }

        return divArray; // whole data of the array is returned
    }

    // global declaration of Scanner - visible to all the methods
    public static Scanner scr = new Scanner(System.in);

    // Method VI - Validation for size of the arrays
    public static int sizeValidation() {
        int x;

        do { // wrong input check
            System.out.println("\n" + "Input preferred count of elements for the arrays: ");
            x = scr.nextInt(); // global Scanner is called

            if (x <= 0) {
                System.out.println("Invalid data!");
                System.out.println("\n" + "Input again: ");
            }
        } while (x <= 0);

        return x; // returning value for arrays' size
    }

    // Method VII - Input data for arrays
    public static double[] elementsInput(int s) {
        double[] inputArray = new double[s];

        for (int i = 0; i < s; i++) {
            System.out.println("Input data for element [" + i + "]: ");
            inputArray[i] = scr.nextDouble(); // global Scanner is called
        }

        return inputArray;
    }

    // Method VIII - Printing data of the new array
    public static void printArray(double[] c, double[] a, double[] b, char arithmeticSign) {
        for (int i = 0; i < c.length; i++) {
            System.out.println("Element [" + i + "] = " + a[i] + " " + arithmeticSign + " " + b[i] +
                    " = " + String.format("%.2f", c[i]));
        }
    }

    // Main method
    public static void main(String[] args) {
        // declaration of two arrays and a variable for both their sizes
        int n = sizeValidation(); // method VI is called

        double[] array1; // 1st array
        double[] array2; // 2nd array

        // input data for elements in each of the arrays
        System.out.println("\n" + "Input data for elements in the 1st array.");
        array1 = elementsInput(n); // method VII is called

        System.out.println("\n" + "Input data for elements in the 2nd array.");
        array2 = elementsInput(n); // method VII is called

        int userChoice; // option from the list below that user chooses

        do {
            optionsList(); // method I is called

            System.out.println("What is your choice?");
            userChoice = scr.nextInt(); // global Scanner is called

            switch (userChoice) {
                case 1:
                    System.out.println("\n" + "S U M");
                    System.out.println();

                    // declaring an additional array for sum
                    double[] sum = new double[n];
                    sumArrays(array1, array2, sum); // method II is called

                    /* Instead of using return method, 'Sum[]' is used as a formal parameter
                            when calling method II. Within the body of this method the parameter accepts
                                data (for an array type) which could be accessed easily from another methods
                                    providing more operations over the array's elements. */
                    break;

                case 2:
                    System.out.println("\n" + "D I F F E R E N C E");
                    System.out.println(); // single line spacing design

                    // declaring an additional array for difference
                    double[] diff = diffArrays(array1, array2); // method III is called

                    printArray(diff, array1, array2, '-'); // method VIII is called
                    break;

                case 3:
                    System.out.println("\n" + "M U L T I P L I C A T I O N");
                    System.out.println(); // single line spacing layout

                    // declaring an additional array for multiplication
                    double[] multi = multiArrays(array1, array2); // method IV is called

                    printArray(multi, array1, array2, '*'); // method VIII is called
                    break;

                case 4:
                    System.out.println("\n" + "D I V I S I O N");
                    System.out.println(); // single line spacing layout

                    // declaring an additional array for division
                    double[] div = divArrays(array1, array2); // method V is called

                    printArray(div, array1, array2, '/');
                    break;

                default:
                    if (userChoice != 5) {
                        System.out.println("Invalid option! Type in again... ");
                    }
            }
        } while (userChoice != 5);

        // message when option 5 is chosen
        System.out.println("\n" + "Exiting the program... ");

        scr.close(); // global Scanner is closed
    }
}
