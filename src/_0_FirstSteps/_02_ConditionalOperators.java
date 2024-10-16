package _0_FirstSteps;

import java.util.Scanner;

public class _02_ConditionalOperators {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("What is your grade?");

        int myGrade = kb.nextInt();

        if (myGrade >= 70) {
            System.out.println("Congratulations, you passed!");
        }
        else {
            System.out.println("You failed!");
        }

    }
}
