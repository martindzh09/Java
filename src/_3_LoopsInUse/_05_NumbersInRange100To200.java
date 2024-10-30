package _3_LoopsInUse;

public class _05_NumbersInRange100To200 {
    public static void main(String[] args) {

        int d1, d2, d3; // digits of numbers
        int sumDigits;

        for (int i = 100; i <= 200; i++) {
            d1 = i % 10;

            d2 = (i / 10) % 10;

            d3 = (i / 100) % 10;

            sumDigits = d1 + d2 + d3;

            if (sumDigits == 5) {
                System.out.println(i);
            }
        }

    }
}
