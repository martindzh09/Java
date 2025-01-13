package _5_VariablesTypes;

import java.util.*;

public class _08_NamesList {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // I. Data for array's size - names' count
        System.out.println("\n" + "I. What is the count of names in your list?");
        int n; // to be assigned to size of the array

        do {
            n = kb.nextInt(); // size is input (by the user)

            if (n <= 0 || n > 100) { // wrong input and limited array's size
                System.out.println("Wrong input data! Type in again... ");
            }
        } while (n <= 0 || n > 100);

        // declaring new array sized to count of names, already specified
        String[] namesList = new String[n];
        int i; // looping variable

        // II. Data specification for names in the list
        System.out.println("\n" + "II. Specify each of the names in the list.");

        for (i = 0; i < n; i++) {
            System.out.print("\n" + "Name [" + i + "] is... ");
            namesList[i] = kb.next();

            // saving first value of name's input data
            String userInput = namesList[i];

            // extracting only the first letter of the name
            String firstLetter = namesList[i].substring(0, 1).toUpperCase();

            /* an 'autocorrection' is occurred if first letter is small,
                    compared to unchanged first letter of 'userInput' variable's value */
            if (!(firstLetter.equals(userInput.substring(0, 1)))) {

                /* name is changed - first letter is capitalized,
                        concatenated to the whole String's value */
                namesList[i] = firstLetter + namesList[i].substring(1);
                System.out.println("* '" + userInput + "' is changed to '" + namesList[i] + "'");
            }
        }

        // III. Finding a name within the list
        System.out.print("\n" + "III. Type in a search name... ");
        String nameToSearch = kb.next();

        // first letter of the search name is extracted
        String firstLetterSearch = nameToSearch.substring(0, 1).toUpperCase();

        // if name is typed in incorrectly, first letter is capitalized
        if (!(firstLetterSearch.equals(nameToSearch.substring(0, 1)))) {

            // -||- concatenation of the first letter and the left part of the name
            nameToSearch = firstLetterSearch + nameToSearch.substring(1);
            System.out.println("* '" + nameToSearch + "' is corrected to '" + nameToSearch + "'");
        }

        // times the search name is found within the list
        int timesFound = 0;

        for (i = 0; i < n; i++) {
            if (namesList[i].equals(nameToSearch)) {
                timesFound++;

                // a restriction that the message is printed once
                if (!(timesFound > 1)) {
                    System.out.println("\n" + "Name '" + nameToSearch +
                            "' is found on position [" + i + "]");
                }
            }
        }

        // an additional message if the name is found multiple times
        if (timesFound > 1) {
            if (timesFound - 1 == 1) { // found only once
                System.out.println("* The name is found on " + (timesFound - 1) + " more another position.");
            }
            else { // found more than once
                System.out.println("* The name is found on " + (timesFound - 1) + " more another positions.");
            }
        }
        // a case where name to search is not found
        if (timesFound == 0) {
            System.out.println("\n" + "'" + nameToSearch + "' is not found in the list.");
        }

        kb.close();
    }
}
