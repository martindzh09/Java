package _1_ConditionalStatements;
import java.util.*;

public class _02_Quadrant {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int k; // quadrant where the point is

        System.out.println("Input coordinates x and y: ");
        double x = kbd.nextDouble(); // x axis in 0(x, y)
        double y = kbd.nextDouble(); // y axis in 0(x, y)

        if (x * y > 0) { // for 1st and 3rd quadrants (- * - = +; + * + = +)
            if (x > 0) // 1st --> x > 0
                k = 1;
            else // 3rd --> x < 0
                k = 3;
        }
        else { // for 2nd and 4th quadrants (- * + = -)
            if (x > 0) // 4th --> x > 0
                k = 4;
            else // 2nd --> x < 0
                k = 2;
        }

        if (x * y == 0) {
            System.out.println("The point is on the axes.");
        }
        else {
            System.out.print("The point is in " + k + " quadrant.");
        }

    }
}
