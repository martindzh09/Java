package _3_LoopsInUse;

public class _01_MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { // first multiplier
            for (int j = 1; j <= 10; j++) { // second multiplier
                System.out.println(i + " * " + j + " = " + (i * j));

                // Second loop iterates for each iteration of the first
            }
            System.out.println(); // optional (not required in task)
        }
    }
}
