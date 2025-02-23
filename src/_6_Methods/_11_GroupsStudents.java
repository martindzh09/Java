package _6_Methods;

import java.util.*;

public class _11_GroupsStudents {

	// Method I - Input data for names in each group of students
	public static ArrayList<String> namesData(int groupNumber) {
		Scanner scr = new Scanner(System.in); // (scanner 1)

		// ArrayList of students' names to be returned
		ArrayList<String> names = new ArrayList<>();

		System.out.println(); // single line spacing

		int borders = 31 + (String.valueOf(groupNumber).length());

		// upper borders layout
		for (int i = 0; i < borders; i++) {
			if (i == 0 || i == (borders - 1)) {
				System.out.print(" "); // no visible border is printed above '|'
			} else { // a hyphen from the border is printed
				System.out.print("-");
			}
		}

		System.out.println("\n" + "| Data for students in Group " + groupNumber + " |");

		// bottom borders layout
		for (int i = 0; i < borders; i++) {
			if (i == 0 || i == (borders - 1)) {
				System.out.print(" "); // no visible border is printed above '|'
			} else { // a hyphen from the border is printed
				System.out.print("-");
			}
		}

		System.out.print("\n" + "* Press ENTER to stop typing in names!");
		System.out.println("\n" + " -------------------------------------");

		System.out.println("\n" + "Type in names... ");
		String name;

		do { // names are input until user presses the 'enter' button
			name = scr.nextLine();

			// input name is added in the ArrayList
			if (!name.isEmpty() && !name.equals(" ")) {
				names.add(name);
			} else {
				if (name.equals(" ")) {
					System.out.println("Empty space is not saved as an appropriate name!");
				} else {
					System.out.println("___________________________________");
					System.out.println("Data for names is not input anymore");
				}
			}
		} while (!name.isEmpty()); // 'enter' is pressed

		return names; // whole data for ArrayList is returned
	}

	// Method II - Options list
	public static void optionsList() {
		System.out.println("\n" + " --------- ");
		System.out.println("| OPTIONS |");
		System.out.println(" --------- ");
		System.out.println("------------------------------------------------ ");
		System.out.println("1. Print students' names of Group I             |");
		System.out.println("2. Print students' names of Group II            |");
		System.out.println("\n" + "3. Print both students' names of Group I and II |");
		System.out.println("\n" + "4. Exit                                         |");
		System.out.println("------------------------------------------------ ");
	}

	// Method III - Printing ArrayList's data
	public static void printData(ArrayList<String> names, int groupNumber) {
		if (groupNumber == 1) {
			System.out.println("\n" + "Data for students' names of 1st Group: ");
			System.out.println("-------------------------------------");
		}
		if (groupNumber == 2) {
			System.out.println("\n" + "Data for students' names of 2nd Group: ");
			System.out.println("-------------------------------------");
		}

		if (!names.isEmpty()) {
			// printing names on each line
			for (String name : names) {
				System.out.println("-> " + name);
			}

			// ArrayList is printed in 'array' format
			System.out.println("\n" + names);
		}
		else {
			System.out.println("\n" + "The list is empty -> [ ]");
		}
	}

	// Method IV - Printing both data from 1st and 2nd group
	public static void groupsPrinted(ArrayList<String> group1, ArrayList<String> group2) {
        System.out.println("\n" + "------------------------------------");
		System.out.println("Data in both groups is the following: ");
		System.out.println("------------------------------------");

		// data for each of the groups is printed
		System.out.println("Group I -> " + group1);
		System.out.println("Group II -> " + group2);

		// saving the names found in both the two groups
		ArrayList<String> foundNames = new ArrayList<>();

		for (String name1 : group1) {
			for (String name2 : group2) {
				if (name2.equals(name1)) {
					// duplicating names is avoided
					if (!foundNames.contains(name2)) {
						// same name is found and added to the list
						foundNames.add(name2);
					}
				}
			}
		}

		if (!foundNames.isEmpty()) {
			System.out.println("---------------------------------------------");
			System.out.println("\n" + "Names below are found both in the two groups!");
			System.out.println(foundNames);
		}
		else {
			System.out.println("\n" + "------------------------------");
			System.out.println("No duplicated names are found!");
			System.out.println("------------------------------");
		}
	}

	// Main Method
	public static void main (String[] args) {
		Scanner scr = new Scanner(System.in); // (scanner 2)

		// ArrayList declaration and data for Group I
		ArrayList<String> group1 = namesData(1); // method I is called
		ArrayList<String> group2 = namesData(2); // method I is called

		int choice; // what is the option user chooses

		do { // multiple execution of the program
			optionsList(); // method II is called

			System.out.println("Choose an option: ");
			choice = scr.nextInt();

			switch (choice) {
				case 1:
					printData(group1, 1); // method III is called
					break;
				case 2:
					printData(group2, 2); // method III is called
					break;

				case 3:
					groupsPrinted(group1, group2); // method IV is called
					break;

				default:
					if (choice != 4) {
						System.out.println("Invalid option!");
					}
			}
		} while (choice != 4);

		System.out.println("\n" + "Exiting the program... ");

		scr.close(); // scanner 2 is closed
	}
}