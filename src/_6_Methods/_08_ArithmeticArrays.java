package _6_Methods;

import java.util.Scanner;

public class _08_ArithmeticArrays {

    // Method I - Sum of arrays (+)
    public static void sumArrays(double[] a, double[] b, double[] sumArray) {
        int m = a.length; // or 'm = b.length'

        for (int i = 0; i < m; i++) {
            sumArray[i] = a[i] + b[i]; // summing elements from different arrays

            System.out.println("Element [" + i + "] = " + a[i] + " + " + parensNegative(b[i]) + " = " +
                    String.format("%.2f", sumArray[i])); // method VIII is called
        }
    }

    // Method II - Difference of arrays (-)
    public static double[] diffArrays(double[] a, double[] b) {
        double[] diffArray = new double[a.length]; // or '[b.length]'

        for (int i = 0; i < a.length; i++) {
            diffArray[i] = a[i] - b[i];
        }

        return diffArray; // whole data of the array is returned
    }

    // Method III - Multiplication of arrays (*)
    public static double[] multiArrays(double[] a, double[] b) {
        double[] multiArray = new double[a.length]; // or '[b.length]'

        for (int i = 0; i < a.length; i++) {
            multiArray[i] = a[i] * b[i];
        }

        return multiArray; // whole data of the array is returned
    }

    // Method IV - Division of arrays (/)
    public static double[] divArrays(double[] a, double[] b) {
        double[] divArray = new double[a.length]; // or '[b.length]'

        for (int i = 0; i < a.length; i++) {
            // additional statements for a division by zero
            if (a[i] != 0) { // any divisible except zero cannot be divided by zero
                if (b[i] != 0) { // case where the divisor is zero
                    divArray[i] = a[i] / b[i];
                }
                else { // message for an invalid operation is printed
                    System.out.println("Cannot divide by zero!");
                    System.out.println("* Element [" + i + "] is set no value" + "\n");

                    divArray[i] = 0.00; // * (optional) element is assigned value 0
                }
            }
            else {
                if (a[i] == 0 && b[i] == 0) { // both divisible and divisor are zero
                    divArray[i] = 0; // otherwise 'divArray[i] = NaN'
                }
                else { // normally executed operation of numbers division
                    divArray[i] = a[i] / b[i];
                }
            }
        }

        return divArray; // whole data of the array is returned
    }

    // Method V - List of options (shown to the user)
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

    // Global declaration of Scanner - visible to all the methods
    public static Scanner scr = new Scanner(System.in);

    // Method VI - Validation for size of the arrays
    public static int sizeValidation() {
        int x;
        System.out.println("\n" + "Input preferred count of elements for the arrays: ");

        do { // wrong input check
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
            System.out.println("\n" + "Input data for element [" + i + "]: ");
            inputArray[i] = scr.nextDouble(); // global Scanner is called
        }

        return inputArray; // data for elements in the array is returned
    }

    // Method VIII - Printing parentheses around the second number if its value is negative
    public static String parensNegative(double b) {
        String modifiedValue;

        if (b < 0) { // second number's value is negative
            modifiedValue = String.format("(%f)", b); // adding parentheses "( )"
        }
        else { // second number's value is positive
            modifiedValue = Double.toString(b); // converted to 'String' type
        }

        return modifiedValue; // value is returned as directly formatted 'String' type
    }

    // Method IX - Printing data from the new array (each of the new arrays)
    public static void printArray(double[] c, double[] a, double[] b, char arithmeticSign) {
        for (int i = 0; i < c.length; i++) {
            if (a[i] != 0 && (b[i] == 0 && arithmeticSign == '/')){
                System.out.println("Element [" + i + "] = (no value)");
            }
            else { // method VIII is called below
                System.out.println("Element [" + i + "] = " + a[i] + " " + arithmeticSign + " " +
                        parensNegative(b[i]) + " = " + String.format("%.2f", c[i]));
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // declaration of two arrays and a variable for both their sizes
        int n = sizeValidation(); // method VI is called
        double[] array1; double[] array2;

        // input data for elements in each of the arrays
        System.out.println("\n" + "Input data for elements in the 1st array.");
        array1 = elementsInput(n); // method VII is called

        System.out.println("\n" + "Input data for elements in the 2nd array.");
        array2 = elementsInput(n); // method VII is called

        int userChoice; // an option from the list below that user chooses

        do {
            optionsList(); // method V is called

            System.out.println("What is your choice?");
            userChoice = scr.nextInt(); // global Scanner is called

            switch (userChoice) {
                case 1:
                    System.out.println("\n" + "S U M");
                    System.out.println(); // single line spacing layout

                    // declaring an additional array for sum
                    double[] sum = new double[n];
                    sumArrays(array1, array2, sum); // method I is called

                    /* Instead of using return method, 'Sum[]' is used as a formal parameter
                            when calling method II. Within the body of this method the parameter accepts
                                data (for an array type) which could be accessed easily from another methods
                                    providing more operations over the array's elements. */
                    break;

                case 2:
                    System.out.println("\n" + "D I F F E R E N C E");
                    System.out.println(); // single line spacing layout

                    // declaring an additional array for difference
                    double[] diff = diffArrays(array1, array2); // method II is called

                    printArray(diff, array1, array2, '-'); // method IX is called
                    break;

                case 3:
                    System.out.println("\n" + "M U L T I P L I C A T I O N");
                    System.out.println(); // single line spacing layout

                    // declaring an additional array for multiplication
                    double[] multi = multiArrays(array1, array2); // method III is called

                    printArray(multi, array1, array2, '*'); // method IX is called
                    break;

                case 4:
                    System.out.println("\n" + "D I V I S I O N");
                    System.out.println(); // single line spacing layout

                    // declaring an additional array for division
                    double[] div = divArrays(array1, array2); // method IV is called

                    printArray(div, array1, array2, '/'); // method IX is called
                    break;

                default:
                    if (userChoice != 5) {
                        System.out.println("Invalid option!");
                    }
            }
        } while (userChoice != 5);

        // message when option 5 is chosen
        System.out.println("\n" + "Exiting the program... ");

        scr.close(); // global Scanner is closed
    }
}
