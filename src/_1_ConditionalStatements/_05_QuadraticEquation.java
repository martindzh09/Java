package _1_ConditionalStatements;
import java.util.*;

public class _05_QuadraticEquation {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a: ");
        double a = kb.nextDouble();

        System.out.println("Input b: ");
        double b = kb.nextDouble();

        System.out.println("Input c: ");
        double c = kb.nextDouble();

        double x1, x2; // solutions of the equation

        double d = Math.pow(b, 2) - 4 * a * c; // discriminant (D)

        if (d > 0) {
            x1 = (-1.0 * b + Math.sqrt(d)) / 2 * a;
            x2 = (-1.0 * b - Math.sqrt(d)) / 2 * a;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            if (d == 0) {
                x1 = (-1.0 * b + 0) / 2 * a; // x1 = x2

                System.out.println("x1 = x2 = " + x1);
            }
            else {
                System.out.println("There is no real solutions.");
            }
        }

    }
}
