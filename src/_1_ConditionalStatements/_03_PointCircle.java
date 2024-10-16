package _1_ConditionalStatements;
import java.util.*;

public class _03_PointCircle {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double d; // side in a square, compared to the radius (r)

        System.out.println("Input x: ");
        double x = kb.nextDouble();

        System.out.println("Input y: ");
        double y = kb.nextDouble();

        System.out.println("Input radius: ");
        double r = kb.nextDouble();

        d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // Pythagorean theorem

        if (d < r) {
            System.out.println("The point is in the circle.");
        }
        else {
            if (d == r) {
                System.out.println("The point is on the circle.");
            }
            else {
                System.out.println("The point is out of the circle.");
            }
        }

    }
}
