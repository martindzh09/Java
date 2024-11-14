package _4_Arrays;

import java.util.*;

public class _05_GradeScore {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int students;

        do {
            System.out.println("Students in the class: ");
            students = kb.nextInt();
        }
        while (students > 32 || students <= 1);

        double[] averageGrade = new double[students];

        double max = averageGrade[0];

        for (int i = 0; i < students; i++) {
            do {
                System.out.println("Average grade of Student №" + (i + 1) + ":");
                averageGrade[i] = kb.nextDouble();
            }
            while ((averageGrade[i] < 2.00) || (averageGrade[i] > 6.00));

            if (averageGrade[i] > max) {
                max = averageGrade[i];
            }
        }

        System.out.println("The highest grade is " + max);

        kb.close();
    }
}
