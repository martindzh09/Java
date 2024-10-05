package _1_ConditionalStatements_if_else;
import java.util.*;

public class _01_Multiples {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Input integer: ");
        int number = kbd.nextInt();

        if (number % 5 == 0) // e.g. 125/5 = 25.0; 125 % 5 = 0
            System.out.println("The number is a multiple of 5.");

        else
            System.out.println("The number is not divisible by 5.");

    }
}
