package _6_Methods;

import java.util.Scanner; import java.util.ArrayList;

public class _09_SchoolStudents {

    // Method I - Input data for students' names
    public static ArrayList<String> namesData() {
        Scanner scrNames = new Scanner(System.in); // (scanner 1)

        System.out.println("\n" + " ----- ");
        System.out.println("|  1  |");
        System.out.println(" ----- ");

        // an ArrayList is declared
        ArrayList<String> names = new ArrayList<>();
        String nameInput; // input for a name of a student

        // a condition which could stop the process of inputting data for names
        boolean typingInNames = true;

        do { // limited to a case in which the user confirms to stop typing in any data
            System.out.println("\n" + "Input a student's name: ");
            nameInput = scrNames.nextLine();

            // avoid saving "" as a regular value of a proper name
            if (!nameInput.isEmpty()) {
                names.add(nameInput);
            }

            // additional message to the user to stop the input - statement 1
            boolean confirm1 = confirmation("Would you like to STOP typing in data for names?");
            // method VII is called above

            if (confirm1) { // user accepts statement 1, above
                // a next message is shown to the user to confirm the operation above - statement 2
                boolean confirm2 = confirmation("Confirm the operation" + "\n" +
                        "* Elements cannot be added anymore!"); // method VII is called

                if (confirm2) { // user accepts statement 2, above
                    // names are not input anymore (till the option is chosen)
                    typingInNames = false;
                }
            }
        } while (typingInNames);

        return names; // returning the whole data in the ArrayList above
    }

    // Method II - Printing students' names
    public static void printNames(ArrayList<String> names) {
        System.out.println("\n" + " ----- ");
        System.out.println("|  2  |");
        System.out.println(" ----- ");

        // ArrayList for names is printed
        if (names.isEmpty()) {
            System.out.println("\n" + "The list is empty -> " + names);
        }
        else {
            System.out.println("\n" + "-> " + names);
        }
    }

    // Method III - Count of the students
    public static void countStudents(int listSize, ArrayList<String> names) {
        System.out.println("\n" + " ----- ");
        System.out.println("|  3  |");
        System.out.println(" ----- ");

        if (listSize > 0) { // 'listSize' accepts a value once an element is ever added in the ArrayList
            if (listSize > 1) { // (plural form)
                System.out.println("\n" + "At first, in the list were " + listSize + " names of students");
            }
            else { // (singular form)
                System.out.println("\n" + "At first, in the list was " + listSize + " name");
            }

            // current size of the ArrayList (count of students)
            if (!names.isEmpty()) {
                if (names.size() > 1) { // (plural form)
                    // count of symbols when printing the border layout
                    for (int i = 0; i < (52 + names.size()); i++) {
                        System.out.print("-");
                    }
                    System.out.println("\n" + "-> Current count of elements in " +
                            "the list is " + names.size() + " names");
                }
                else { // (singular form)
                    // count of symbols when printing the border layout
                    for (int i = 0; i < (52 + names.size()); i++) {
                        System.out.print("-");
                    }
                    System.out.println("\n" + "-> Current count of elements in " +
                            "the list is " + names.size() + " name");
                }

                // whenever elements are not removed
                if (names.size() == listSize) {
                    System.out.println("* List is unchanged |");
                    System.out.println("--------------------");
                }
            }
            else { // all students have been deleted
                System.out.println("---------------------------------------------------");
                System.out.println("-> Currently there are NO elements left in the list");
            }
        }
        else { // value is not assigned to 'listSize' yet
            System.out.println("\n" + "_______________________________________");
            System.out.println("Data for students is not specified yet!" +
                    "\n" + "* Option 1 is required |");

            System.out.println("---------------------- ");
        }
    }

    // Method IV - All students with a name starting with a specified letter
    public static void startingNames(ArrayList<String> names) {
        Scanner scrLetter = new Scanner(System.in); // (scanner 2)

        System.out.println("\n" + " ----- ");
        System.out.println("|  4  |");
        System.out.println(" ----- ");

        System.out.print("\n" + "Specify a starting letter of students' names: ");
        String firstLetter = scrLetter.next();

        int foundNames = 0; // how many names with the starting letter are found
        ArrayList<String> namesFound = new ArrayList<>(); // saving found names in an ArrayList

        for (String name : names) {
            if (name.startsWith(firstLetter)) {
                namesFound.add(name); // found names are added as new elements in the list
                foundNames++; // increasing the value of ArrayList's size
            }
        }

        if (foundNames > 0) {
            System.out.print("\n" + "Names starting with the letter '" + firstLetter + "': ");

            // data from the list (names) is printed
            for (String name : namesFound) {
                System.out.print(name + "\t");
            }

            System.out.println(); // single line spacing
        }
        else { // names with the specified letter don't exist in the list
            System.out.println("\n" + "No name with the letter '" + firstLetter + "' is found in the list");
            System.out.println("* Check if letter is uppercase or lowercase |");
            System.out.println("--------------------------------------------");
        }
    }

    // Method V - Remove a student by a specified name
    public static void removeStudent(ArrayList<String> names) {
        Scanner scrRemove = new Scanner(System.in); // (scanner 3)

        System.out.println("\n" + " ----- ");
        System.out.println("|  5  |");
        System.out.println(" ----- ");

        System.out.println("\n" + "Input a specific name to be removed: ");
        String removeName = scrRemove.nextLine();

        // new ArrayList, saving the indexes if the specified name to remove is found multiple times
        ArrayList<Integer> removeIndexes = new ArrayList<>();

        // iterating through all the names within the ArrayList
        for (String name : names) {
            if (name.equals(removeName)) {
                // positions (indexes) are added (saved) to the new ArrayList
                removeIndexes.add(names.indexOf(name));
            }
        }

        // deletion of an element - statement 1
        boolean remove1 = confirmation("Are you sure you would like to remove this element?");
        // method VII is called above

        if (remove1) { // statement 1 is accepted
            // confirmation of the deletion above - statement 2
            boolean remove2 = confirmation("Confirm the deletion!"); // method VII is called

            if (remove2) { // statement 2 is accepted
                // how many indexes the name to be removed is found on
                int countRemovedIndexes = 0;

                // iterating through the elements of the new ArrayList
                for (int removed : removeIndexes) {
                    names.remove(removed); // removing name/s on specific position/s
                    countRemovedIndexes++;
                }

                if (countRemovedIndexes > 0) { // at least one element is found
                    if (countRemovedIndexes > 1) { // (plural form)
                        System.out.println("\n" + "'" + removeName + "' has just been removed from "
                                + countRemovedIndexes + " positions" + "\n" + "* Check option 2 |");

                        System.out.println("----------------- "); // bottom border layout
                    }
                    else { // (singular form)
                        System.out.println("\n" + "'" + removeName + "' has just been removed from " +
                                countRemovedIndexes + " position" + "\n" + "* Check option 2 |");

                        System.out.println("----------------- "); // bottom border layout
                    }
                }
                else { // specified name is not found in the list; no elements are removed
                    System.out.println("\n" + "'" + removeName + "' is not found within the list!");
                    System.out.println("* Check the correct spelling of the name (option 2) |");
                    System.out.println("---------------------------------------------------- ");
                }
            }
            else { // statement 2 is denied - element is not deleted
                System.out.println("\n" + "------------------------");
                System.out.println("No elements are removed!");
                System.out.println("------------------------");
            }
        }
        else { // statement 1 is denied - element is not deleted
            System.out.println("\n" + "------------------------");
            System.out.println("No elements are removed!");
            System.out.println("------------------------");
        }
    }

    // Method VI - Removing all students
    public static void clearStudents(ArrayList<String> names) {
        System.out.println("\n" + " ----- ");
        System.out.println("|  6  |");
        System.out.println(" ----- ");

        // deleting all elements - statement 1
        boolean delete1 = confirmation("Are you sure you would like to delete all elements?");
        // method VII is called above

        if (delete1) { // statement 1 is accepted
            // confirmation of the deletion - statement 2
            boolean delete2 = confirmation("Confirm the deletion." + "\n" +
                    "* Deleted items cannot be restored!"); // method VII is called

            if (delete2) { // statement 2 is accepted
                names.clear(); // clearing all data for the elements in the ArrayList

                System.out.println("\n" + "--------------------------------------------------- ");
                System.out.println("All students have just been deleted from the list! |");
                System.out.println("--------------------------------------------------- ");

                System.out.println("* Check option 2 |");
                System.out.println("-----------------");
            }
            else { // statement 2 is denied
                System.out.println("\n" + " -------------------------- ");
                System.out.println("| Elements are not deleted |");
                System.out.println(" -------------------------- ");
            }
        }
        else { // statement 1 is denied
            System.out.println("\n" + " -------------------------- ");
            System.out.println("| Elements are not deleted |");
            System.out.println(" -------------------------- ");
        }
    }

    // Method VII - Confirmation before any changes (e.g. deletion)
    public static boolean confirmation(String message) {
        Scanner scrConfirm = new Scanner(System.in); // (scanner 4)

        System.out.println(); // single line spacing layout

        // borders above the statement (for confirmation)
        for (int i = 0; i < message.length(); i++) {
            System.out.print("_");
        }

        // the message set for a parameter is printed
        System.out.println("\n" + message);

        // included answers, borders layout
        System.out.println(" ------------ ");
        System.out.println("|  YES / NO  |");
        System.out.println(" ------------ ");

        String answer; // what user inputs (below)
        boolean confirmAnswer = false; // answer is a value starting with 'Y' or 'y'

        // answer different from the only two (net 4) answers available
        boolean invalidAnswer;

        do { // multiply required answering if user inputs invalid data
            answer = scrConfirm.nextLine();

            if ((answer.startsWith("y") || answer.startsWith("Y")) &&
                    (!answer.startsWith("n") || !answer.startsWith("N"))) {
                confirmAnswer = true; // user confirms
                invalidAnswer = false; // valid answer is registered
            }
            else {
                // anything different from 'yes' or 'no' is registered as an invalid answer
                invalidAnswer = (!answer.startsWith("n") && !answer.startsWith("N")) ||
                        (answer.startsWith("y") && answer.startsWith("Y"));
            }
        } while (invalidAnswer);

        return confirmAnswer; // 'true' or 'false' is returned
    }

    // Method VIII - List of options
    public static void optionsList() {
        System.out.println("\n" + "----------------------------------------------------");
        System.out.println("[ LIST WITH OPTIONS ]                              |");

        System.out.println("\n" + "1. Input data for students                         |");
        System.out.println("2. Visualize list's data                           |");
        System.out.println("3. Count of students                               |");
        System.out.println("4. Students' names starting with a specific letter |");
        System.out.println("5. Delete a specific student                       |");
        System.out.println("6. Delete all students                             |");

        System.out.println("\n" + "7. Exit                                            |");
        System.out.println("----------------------------------------------------");

        System.out.println("* Option 1 is required |");
        System.out.println("-----------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // ArrayList for students' names is declared
        ArrayList<String> students = new ArrayList<>();

        int option; // choice of the user
        int savedSize = 0; // saving the exact size of the ArrayList

        do {
            optionsList(); // method VII is called

            System.out.println("\n" + "Choose an option: ");
            option = scr.nextInt();

            switch (option) {
                case 1:
                    students = namesData(); // method I is called

                    // saving the first value for count of students
                    savedSize = students.size();
                    break;

                case 2:
                    printNames(students); // method II is called
                    break;

                case 3:
                    countStudents(savedSize, students); // method III is called
                    break;

                case 4:
                    startingNames(students); // method IV is called
                    break;

                case 5:
                    removeStudent(students); // method V is called
                    break;

                case 6:
                    clearStudents(students); // method VI is called
                    break;

                default:
                    if (option != 7) {
                        System.out.println("Invalid option!");
                    }
            }
        } while (option != 7);

        // option 7 is reached (chosen)
        System.out.println("\n" + "Exiting the program... ");

        scr.close();
    }
}
