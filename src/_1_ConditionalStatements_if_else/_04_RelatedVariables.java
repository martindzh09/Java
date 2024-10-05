package _1_ConditionalStatements_if_else;
import java.util.*;

public class _04_RelatedVariables {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double y; // its value depends on x's value

        System.out.println("Input data for x: ");
        double x = kb.nextDouble();

        if (x < 0) {
            y = 15 * Math.pow(x, 6) - 10 * Math.pow(x, 3) + 2;
        }
        else {
            y = Math.pow(x, 2) + (1.0 / 2) * x - Math.sqrt(x + 3);
        }

        System.out.println("y = " + y);

    }
}
