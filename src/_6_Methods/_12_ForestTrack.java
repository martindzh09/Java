package _6_Methods;

import java.util.Scanner;

public class _12_ForestTrack {

    // Method 1 - Sizing the track
    public static int[] tracksSize() {
        Scanner scr1 = new Scanner(System.in); // scanner 1

        // an array saving two values - needed to be returned
        int[] sizes = new int[2];

        System.out.println("\n" + "------------------------------------");
        System.out.println("Input data for LENGTH of your track: ");
        System.out.println("------------------------------------");

        do { // check for a wrong input for length of the track
            sizes[0] = scr1.nextInt();

            if (sizes[0] <= 0) { // a message is printed when invalid input
                System.out.println("\n" + "Invalid data for length!");
                System.out.println("------------------------");
                System.out.println("Input again: ");
            }
        } while (sizes[0] <= 0);

        System.out.println("\n" + "-----------------------------------");
        System.out.println("Input data for WIDTH of your track: ");
        System.out.println("-----------------------------------");

        do { // check for a wrong input for width of the track
             sizes[1] = scr1.nextInt();

            if (sizes[1] <= 0) { // a message is printed when invalid input
                System.out.println("\n" + "Invalid data for width!");
                System.out.println("-----------------------");
                System.out.println("Input again: ");
            }
        } while (sizes[1] <= 0);

        return sizes; // both two values (as an array) are returned
    }

    // Method 2 - Track's data
    public static char[][] tracksData(int length, int width) {
        Scanner scr2 = new Scanner(System.in); // scanner 2

        System.out.println("\n" + "--------------------------");
        System.out.println("Input DATA for your track: ");
        System.out.println("--------------------------");

        // two-dimensional array storing track's data (positions of rocks, streams and numbers of density)
        char[][] track = new char[length][width];

        // while 'true' user is allowed to input data for track
        boolean invalidTrack;

        do {
            invalidTrack = false; // reset each next iteration

            // 1) Data for track is input
            for (int i = 0; i < length; i++) { // looping rows
                // a temporary variable for the whole row's data
                String row = scr2.nextLine();

                for (int j = 0; j < width; j++) { // looping columns
                    // row's data is separated into symbols then saved as elements in the array
                    track[i][j] = row.charAt(j);
                }
            }

            // 2) Track's data is checked for an invalid element
            for (int i = 0; i < length; i++) { // (outer loop)
                for (int j = 0; j < width; j++) { // (inner loop)
                    // any symbols different from these below mark the whole track as invalid
                    if (track[i][j] != 'S' && track[i][j] != 'P' && track[i][j] != '1' &&
                            track[i][j] != '2' && track[i][j] != '3' && track[i][j] != '4') {
                        // when unknown symbol is found
                        invalidTrack = true;
                        break; // breaking inner loop
                    }
                }

                if (invalidTrack) {
                    System.out.println("\n" + "----------------------");
                    System.out.println("Invalid data is found");
                    System.out.println("Input data again: ");
                    break; // breaking outer loop
                }
            }
        } while (invalidTrack);

        // when exiting the loop with 'false' (for an invalid track)
        System.out.println("\n" + "----------------------------------");
        System.out.println("* Track is validated successfully.");
        System.out.println("----------------------------------");

        // data for track is printed
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(track[i][j] + " ");
            }
            System.out.println(); // next line when whole row is printed
        }

        return track;
    }

    // Method 3 - Similar density in surrounding areas
    public static int surroundingAreas(char[][] unchangedTrack, int i, int j) {
        // counting how many (e.g. out of max 8) surrounding areas are with the same density of 4
        int countSameSurroundings = 0;

        // specific number of density of the area which surroundings are checked
        if (i - 1 >= 0 && j - 1 >= 0) {
            if (unchangedTrack[i - 1][j - 1] == '4') { // upper left diagonal
                countSameSurroundings++;
            }
        }
        if (i - 1 >= 0) {
            if (unchangedTrack[i - 1][j] == '4') { // over the element
                countSameSurroundings++;
            }
        }
        if (i - 1 >= 0 && j + 1 <= unchangedTrack[0].length - 1) {
            if (unchangedTrack[i - 1][j + 1] == '4') { // upper right diagonal
                countSameSurroundings++;
            }
        }
        if (j - 1 >= 0) {
            if (unchangedTrack[i][j - 1] == '4') { // on left from the element
                countSameSurroundings++;
            }
        }
        if (j + 1 <= unchangedTrack[0].length - 1) {
            if (unchangedTrack[i][j + 1] == '4') { // on right from the element
                countSameSurroundings++;
            }
        }
        if (i + 1 <= unchangedTrack.length - 1 && j - 1 >= 0) {
            if (unchangedTrack[i + 1][j - 1] == '4') { // bottom left diagonal
                countSameSurroundings++;
            }
        }
        if (i + 1 <= unchangedTrack.length - 1) {
            if (unchangedTrack[i + 1][j] == '4') { // under the element
                countSameSurroundings++;
            }
        }
        if (i + 1 <= unchangedTrack.length - 1 && j + 1 <= unchangedTrack[0].length - 1) {
            if (unchangedTrack[i + 1][j + 1] == '4') { // bottom right diagonal
                countSameSurroundings++;
            }
        }

        return countSameSurroundings;
    }

    // Method 4 - Data for track's years
    public static void changingTrack(char[][] unchangedTrack) {
        Scanner scr3 = new Scanner(System.in); // scanner 3

        // a new 2D array where original track with changes is saved
        char[][] changedTrack = new char[unchangedTrack.length][unchangedTrack[0].length];

        System.out.println("\n" + "-----------------------------");
        System.out.println("Input data for track's YEARS: ");
        System.out.println("-----------------------------");

        int years = scr3.nextInt(); // track's years
        int countOfChanges;

        // track changes every 10 years
        if (years % 10 <= 0) {
            // calculating needed times track is changed
            countOfChanges = years / 10;

            for (int change = 1; change <= countOfChanges; change++) {
                if (change == 1) {
                    for (int i = 0; i < unchangedTrack.length; i++) {
                        for (int j = 0; j < unchangedTrack[0].length; j++) {
                            // changes according to the density of the original track
                            if (unchangedTrack[i][j] == '1') {
                                changedTrack[i][j] = '2';
                            } else if (unchangedTrack[i][j] == '2') {
                                changedTrack[i][j] = '3';
                            } else if (unchangedTrack[i][j] == '3') {
                                changedTrack[i][j] = '4';
                            } else if (unchangedTrack[i][j] == '4') {
                                // changed only in specific conditions referring to the surrounding areas
                                if (surroundingAreas(unchangedTrack, i, j) >= 3) { // method 3 is called
                                    changedTrack[i][j] = '3';
                                } else {
                                    changedTrack[i][j] = '4';
                                }
                            }
                            else { // no changes are occurred (e.g. a rock or a stream)
                                changedTrack[i][j] = unchangedTrack[i][j];
                            }
                        }
                    }
                }
                else {
                    for (int i = 0; i < changedTrack.length; i++) {
                        for (int j = 0; j < changedTrack[0].length; j++) {
                            // changes according to the density of the original track
                            if (changedTrack[i][j] == '1') {
                                changedTrack[i][j] = '2';
                            } else if (changedTrack[i][j] == '2') {
                                changedTrack[i][j] = '3';
                            } else if (changedTrack[i][j] == '3') {
                                changedTrack[i][j] = '4';
                            } else if (changedTrack[i][j] == '4') {
                                // changed only in specific conditions referring to the surrounding areas
                                if (surroundingAreas(changedTrack, i, j) >= 3) { // method 3 is called
                                    changedTrack[i][j] = '3';
                                } else {
                                    changedTrack[i][j] = '4';
                                }
                            }
                            else { // no changes are occurred (e.g. a rock or a stream)
                                changedTrack[i][j] = changedTrack[i][j];
                            }
                        }
                    }
                }
            }
        }
        else {
            changedTrack = unchangedTrack; // new track is unchanged
        }

        System.out.println("\n" + "----------------------- ");
        System.out.println("Track with changes: ");
        System.out.println("----------------------- ");

        // printing changed track
        for (char[] row : changedTrack) {
            for (int j = 0; j < changedTrack[0].length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println(); // next line when whole row is printed
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] temporaryArray = tracksSize(); // method 1 is called

        // assigning 'length' and 'width' variables values from the array
        int length = temporaryArray[0];
        int width = temporaryArray[1];

        // new two-dimensional array's data is assigned via method
        char[][] myTrack = tracksData(length, width); // method 2 is called

        // printing new track (with changes)
        changingTrack(myTrack); // method 4 is called
    }
}