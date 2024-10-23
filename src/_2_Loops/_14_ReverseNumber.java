package _2_Loops;

import java.util.*;

public class _14_ReverseNumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = kb.nextInt();

        int result = 0;

        while (num != 0) { //
            int digit = num % 10; // last digit
            result = result * 10 + digit; // it changes it value till the end

            /*
            1) Moving the decimal point on right multiplying by 10
               2) Initializing digit's value depending on the position
               3) The result keeps updating to its full value of digits till their count equals
                  to input number's count.
                  * Number increases by multiplication by 10 then it accepts the digit because
                    the last sum resets with each iteration (multiplied by 0)!
             */

            num /= 10; // move the decimal point one position on left (to the next digit)
        }
        
        System.out.println("Digits in reverse order are: "+ result);

        kb.close();
    }
}
