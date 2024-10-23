package _2_Loops;

import java.util.*;

public class _17_SumMirrorNumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = kb.nextInt();

        int saveNum = num;

        int mirrorNum = 0; // a variable for the new number

        while (num != 0) {
            int digit = num % 10; // each digit
            mirrorNum = mirrorNum * 10 + digit; // moving the decimal point on right by multiplying by 10

            num /= 10; // removing a digit then proceeding to the next one on left
        }

        System.out.println("Sum of " + saveNum + " and its mirror number " +
                "(" + mirrorNum + ")" + " is " + (saveNum + mirrorNum));

        kb.close();
    }
}
