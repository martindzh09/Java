package _3_LoopsInUse;

public class _08_FourDigitNumbers {
    public static void main(String[] args) {

        int sum;
        boolean twoSameDigits = false;

        for (int i = 1000; i <= 9999; i++) {

            int d1 = i % 10; // 4th digit
            int d2 = (i / 10) % 10; // 3rd digit
            int d3 = (i / 100) % 10; // 2nd digit
            int d4 = (i / 1000) % 10; // 1st digit

            sum = d1 + d2 + d3 + d4;

            if (sum % 2 == 0) { // at least two of the digits are equal
                // sum of two equal digits is always an even number
                twoSameDigits = true;
            }

            if ((twoSameDigits) && (sum < 9)) {
                System.out.print(i + " ");
            }
        }

    }
}
