package _3_LoopsInUse;

public class _07_SameNumbersBackToFront {
    public static void main(String[] args) {

        int d1, d2, d3; // variables declaring the digits from right to left


        for (int i = 100; i <= 500; i++) {
            d1 = i % 10;

            d2 = (i / 10) % 10;

            d3 = (i / 100) % 10;

            if (d1 == d3) {
                System.out.print(i + " ");
            }
        }

    }
}
