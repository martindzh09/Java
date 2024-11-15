package _4_Arrays;

import java.util.*;

public class _04_MonthTemperatures {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String month;
        boolean validMonth; // wrong input "flag"

        do { // wrong input check
            // Input current month
            System.out.println("Input a month: ");
            month = kb.nextLine();

            validMonth = month.equals("January") || month.equals("February") || month.equals("March") ||
                    month.equals("April") || month.equals("May") || month.equals("June") || month.equals("July") ||
                    month.equals("August") || month.equals("September") || month.equals("October") ||
                    month.equals("November") || month.equals("December");
        }
        while (!validMonth);

        int monthDays = 0;

        switch (month) {
            case "January": case "March": case "May": case "July":
            case "August": case "October": case "December":

                monthDays = 31;
                break;

            case "April": case "June":
            case "September": case "November":

                monthDays = 30;
                break;

            case "February":
                boolean validAnswer = false;
                // Check for leap or non-leap year (different values)
                do {
                    System.out.println("Is this year leap or not?");
                    String answer = kb.nextLine();

                    if (answer.equals("Yes")) {
                        monthDays = 29;
                        validAnswer = true;
                    }
                    if (answer.equals("No")) {
                        monthDays = 28;
                        validAnswer = true;
                    }
                }
                while (!validAnswer);
                break;

        }
        // variable for specified temperature
        double preferredTemp;

        do {
            System.out.println("Input preferred average temperature per a day: ");
            // Variable is assigned а value compared to array's input values (by weather forecast's stats)
            preferredTemp = kb.nextDouble();
        }
        while ((preferredTemp < -40) || (preferredTemp > 55));

        double[] dailyTemp = new double[monthDays]; // (forecast's stats)

        // counter (for all days with a temperature == 'preferredTemp')
        int daysPreferredTemp = 0;

        // assigning values for each day (of month)
        for (int i = 0; i < monthDays; i++) {
            do {
                System.out.println("Input the average temperature for today (" + (i + 1) + " " + month + "):");
                dailyTemp[i] = kb.nextDouble();
            } // varying-normal range of temperatures check
            while ((dailyTemp[i] < -40 || dailyTemp[i] > 55));

            if (dailyTemp[i] == preferredTemp) {
                daysPreferredTemp++;
            }
        }

        System.out.println("In " + month + ", " + daysPreferredTemp +
                " days had an average temperature of " + preferredTemp + " degrees Celsius.");

        kb.close();
    }
}
