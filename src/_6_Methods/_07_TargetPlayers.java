package _6_Methods;

import java.util.*;

public class _07_TargetPlayers {

    // Method I - Calculating each of the distances scored
    public static double result(double abscissa, double ordinate) {
        double radius;

        // formula is proven by the Pythagorean theorem, where radius is the hypotenuse
        radius = Math.sqrt(Math.pow(abscissa, 2) + Math.pow(ordinate, 2));

        // the result in points
        return points(radius); // method II is called
    }

    // Method II - Distances converted to Points
    public static double points(double distance) {
        double result;

        if (distance >= 0 && distance < 2.5) {
            result = 100;
        }
        else if (distance >= 2.5 && distance < 10) {
            if (distance <= 5) {
                result = 92.5;
            } else {
                result = 90;
            }

            if (distance == 2.5) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 10 && distance < 15) {
            result = 80;

            if (distance == 10) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 15 && distance < 20) {
            result = 70;

            if (distance == 15) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 20 && distance < 25) {
            result = 60;

            if (distance == 20) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 25 && distance < 30) {
            result = 50;

            if (distance == 25) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 30 && distance < 35) {
            result = 40;

            if (distance == 30) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 35 && distance < 40) {
            result = 30;

            if (distance == 35) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 40 && distance < 55) {
            result = 20;

            if (distance == 40) { // extra points for scoring a border
                result += 0.25;
            }
        } else if (distance >= 55 && distance < 60) {
            result = 10;

            if (distance == 55) { // extra points for scoring a border
                result += 0.25;
            }
        } else {
            result = 0;
        }

        return result; // in points
    }

    // Method III - Count of players, correspondingly to the scores saved in an array
    public static int arraysSize() {
        Scanner scrInt = new Scanner(System.in);

        System.out.println("\n" + "What is the count of players?");
        int n; // declared variable for the count of players

        do { // check for wrong input or a limit for count of players
            n = scrInt.nextInt();

            if (n <= 0) { // negative input
                System.out.println("Invalid data for count of players!");
                System.out.println("\n" + "Type in again: ");
            }
            if (n > 10) { // limit for players
                System.out.println("Too many players! Up to 10 players in a single game!");
                System.out.println("\n" + "Type in again: ");
            }
        } while (n <= 0 || n > 10);

        return n; // size of the array is returned
    }

    // Method IV - Finding a winner - the best result (closest to the centre)
    public static int bestScoreIndex(double[] scores) {
        // value on the first index is set to the best score
        double bestScore = scores[0];

        // first index is set as the position of the best score
        int bestIndex = 0;

        // all elements are checked
        for (int i = 0; i < scores.length; i++) {
            if (bestScore < scores[i]) {
                bestScore = scores[i]; // new best score is found

                bestIndex = i; // its position (index) is marked
            }
        }

        return bestIndex; // position of the best result is returned
    }

    // Main method
    public static void main(String[] args) {
        Scanner scrDouble = new Scanner(System.in); Scanner scrStr = new Scanner(System.in);

        int n = arraysSize(); // method III is called

        double[] scores = new double[n]; // scores of the players
        String[] players = new String[n]; // names of players

        for (int i = 0; i < n; i++) {
            // input data for a player's name
            System.out.println("\n" + "What is the name of Player " + (i + 1) + "?");
            players[i] = scrStr.nextLine();

            // coordinates on abscissa and ordinate
            System.out.println("\n" + "What are the coordinates of player's pointed place?");

            System.out.println("X-axis: ");
            double x = scrDouble.nextDouble();

            System.out.println("Y-axis: ");
            double y = scrDouble.nextDouble();

            scores[i] = result(x, y); // method I is called
        }

        // method IV is called
        System.out.println("\n" + "The winner is Player " + (bestScoreIndex(scores) + 1) + " - " +
                players[bestScoreIndex(scores)] + ", with a score of " +
                String.format("%.2f", scores[bestScoreIndex(scores)]) + " points.");

        scrStr.close(); scrDouble.close();
    }
}