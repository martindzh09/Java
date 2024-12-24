package _5_VariablesTypes;

import java.util.*;

public class _07_Email {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        char atSign = '@';

        System.out.println("\n" + "What is your email address?");
        System.out.print("Type it in... ");

        String mail;
        boolean validMail;
        int atPosition;

        do {
            mail = kb.next();
            atPosition = mail.indexOf(atSign);

            validMail = (mail.indexOf(atSign) > 0) && (!mail.startsWith("@")); // '@' found/not found

            if (!validMail) {
                System.out.println("\n"+ "Non-valid email address!");
                System.out.print("Type in again... ");
            }
        }
        while (!validMail);

        String domain = mail.substring(atPosition + 1);

        if (!domain.isEmpty()) {
            switch (domain) {
                case "abv.bg":
                    System.out.println("ABV domain; commonly used in Bulgaria");
                    break;

                case "gmail.com":
                    System.out.println("Gmail domain; provided by Google");
                    break;

                case "yahoo.com":
                    System.out.println("Yahoo domain");
                    break;

                case "outlook.com":
                    System.out.println("Outlook domain; provided by Microsoft");
                    break;

                default:
                    System.out.println("Other domain.");
            }
        }
        else {
            System.out.println("No domain is found!");
        }

        kb.close();
    }
}
