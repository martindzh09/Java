package _2_Loops;

import java.util.*;

public class _18_AskQuestions {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String question = "";

        do {
            System.out.println("Ask a question...");
            question = kb.nextLine();
        }
        while (!(question.equals("Y") || question.equals("N")));

        if (question.equals("Y")) {
            System.out.println("Yes.");
        }
        else {
            System.out.println("No.");
        }


        kb.close();
    }
}
