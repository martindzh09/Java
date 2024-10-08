package _1_ConditionalStatements_if_else;
import java.util.*;

public class _06_TargetTwoPlayers {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Player 1 - Start!"); // First player
        System.out.println("Input x1: ");
        double x1 = kb.nextDouble();

        System.out.println("Input y1: ");
        double y1 = kb.nextDouble();

        System.out.println("Player 2 - It's your turn!"); // Second player
        System.out.println("Input x2: ");
        double x2 = kb.nextDouble();

        System.out.println("Input y2: ");
        double y2 = kb.nextDouble();

        double d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)); // distances from the center of target (radius 1)
        double d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)); // d1 -> 1st player; d2 -> 2nd player (radius 2)

        int s1 = 5, s2 = 10, s3 = 15; // sectors' distances from the centre point

        int p1 = 0, p2 = 0; // points a player scores, based on the sector

        // Points of player 1:
        if (d1 < s1) { // 1st sector (the smallest one)
            p1 = 20; // the closest to the centre score (0 -> the centre)
        }
        else {
            if (d1 < s2) { // 2nd sector (bigger radius than the 1st one's)
                p1 = 10;
            }
            else { // 3rd sector (far away from the centre)
                    p1 = 5;
                // else --> Out of the target's area (d1 > s3) => p1 = 0
            }
        }
        // Points of player 2:
        if (d2 < s1) { // -||-
            p2 = 20;
        }
        else {
            if (d2 < s2) { // -||-
                p2 = 10;
            }
            else { // -||-
                    p2 = 5;
                // else --> Out of the target's area (d2 > s3) => p2 = 0
            }
        }

        System.out.println("Points of player 1: " + p1);
        System.out.println("Point of player 2: " + p2);

        if (p1 > p2) {
            System.out.println("Player 1 is the winner!");
        }
        else {
            if (p1 == p2) {
                System.out.println("Draw.");
            }
            else {
                System.out.println("Player 2 is the winner!");
            }
        }

    }
}

