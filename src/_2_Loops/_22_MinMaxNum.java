package _2_Loops;

import java.util.*;

public class _22_MinMaxNum {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = kb.nextInt();

        int min = num, max = num; // initializing variables for min and max number

        boolean twoZeros = false;

        do { // first must-done iteration by loop's purpose
            System.out.println("Input a number: ");
            num = kb.nextInt(); // second number input needed for a comparison

            if (num != 0) { // any case with no 0 for input
                if ((num < min) && (min != 0)) { // can't compare another numbers when min variable is not changed yet
                    min = num; // zero value is not compared
                }
                else {
                    if ((num < max) && (num < min)) { // input number is less than the previous max number found
                        min = num;
                    }
                    else { // (false above)
                        if (num > max) { // compared to first value of max if found before the loop
                            max = num;
                        }
                    }
                }
            }
            else {
                twoZeros = (min == 0) || (max == 0);
            }
        }
        while (num != 0);

        if (twoZeros) {
            System.out.println("Error!");
        }
        else {
            System.out.println("Min number is " + min);
            System.out.println("Max number is " + max);
        }

        kb.close();
    }
}
