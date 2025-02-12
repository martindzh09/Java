package _6_Methods;

import java.util.*; // import java.util.ArrayList and ... .Scanner

public class _10_StudentsGrades {

    // Method I - Data for students' names
    public static String[] namesData() {
        Scanner scr = new Scanner(System.in); // (scanner 1)
        Scanner scrStr = new Scanner(System.in); // (scanner 2)

        System.out.println("\n" + " -------------------------------------------- ");
        System.out.println("| How many students study in one speciality? |");
        System.out.println(" -------------------------------------------- ");

        int n; // variable containing the size of the array - count of students

        do {
            n = scr.nextInt();

            if (n < 5 || n > 200) { // count of students is in a range
                System.out.println("-----------------------------------");
                System.out.println("Invalid count of students! [5; 200]");
                System.out.println("-----------------------------------");

                System.out.println("\n" + "Type in again... ");
            }
        } while (n < 5 || n > 200);

        // an array in which names of the students are saved
        String[] names = new String[n];

        for (int i = 0; i < n; i++) { // data for names is input
            System.out.println("\n" + "What is the name of Student " + (i + 1) + "?");
            names[i] = scrStr.nextLine();
        }

        return names; // whole data for the names is returned as an array value
    }

    // Method II - Data for students' grades
    public static double[] gradesData(int n, String[] names) {
        Scanner scrD = new Scanner(System.in); // (scanner 3)

        // an array in which grades of the students are saved
        double[] grades = new double[n]; // sized to 'n' which value is assigned from method I

        for (int i = 0; i < n; i++) {
            System.out.println("\n" + "Input a grade for Student " + (i + 1) +
                    " - " + names[i] + ": "); // * (i + 1) - avoiding 0 as number of a student

            do { // invalid grades check
                grades[i] = scrD.nextDouble();

                if (grades[i] < 2.00 || grades[i] > 6.00) {
                    System.out.println("\n" + "Invalid data for a grade!");

                    System.out.println("------------------------------------------");
                    System.out.println("* Grades are within the range [2.00; 6.00]");
                }
            } while (grades[i] < 2.00 || grades[i] > 6.0);
        }

        return grades; // whole data for the grades is returned as an array value
    }

    // Method III - Average grade of the students
    public static double averageGrade(double[] grades) {
        double averageResult = 0.00;

        for (double grade : grades) {
            averageResult += grade; // summing all the grades
        }

        // proven by the formula for and average value of numbers
        averageResult /= grades.length; // sum is divided by the count of all elements

        return averageResult; // the average value is returned
    }

    // Method IV - Students with a grade greater than the average grade (from method III)
    public static void greaterGrade(String[] names, double[] grades, double averageGrade) {
        // greater grades are saved in an ArrayList
        ArrayList<Double> greaterGrades = new ArrayList<>();

        // saving indexes (numbers) of the students in another ArrayList
        ArrayList<Integer> studentsNumber = new ArrayList<>();

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > averageGrade) {
                greaterGrades.add(grades[i]); // adding elements for the greater grades

                studentsNumber.add(i); // saving the index (number of the student)
            }
        }

        System.out.println(); // single line spacing, border's layout (below)

        for (int b = 0; b < 78; b++) {
            System.out.print("-"); // upper border layout
        }

        System.out.println("\n" + "Grades of the students greater than the average " +
                "grade (" + String.format("%.2f", averageGrade) + ") are the following: ");

        for (int h = 0; h < 78; h++) {
            System.out.print("-"); // bottom border layout
        }

        System.out.println(); // single line spacing

        // data for students with greater grades than the average grade
        for (int i = 0; i < greaterGrades.size(); i++) {
            System.out.println("Student " + (studentsNumber.get(i) + 1) + " - " +
                    names[studentsNumber.get(i)] + " -> " + String.format("%.2f", greaterGrades.get(i)));
        }
    }

    // Main method
    public static void main(String[] args) {
        String[] names = namesData(); // method I is called

        // accepting value for the size of 'names[]', from method I
        int n = names.length;

        double[] grades = gradesData(n, names); // method II is called

        double averageResult = averageGrade(grades); // method III is called

        greaterGrade(names, grades, averageResult); // method IV is called
    }
}