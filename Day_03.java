// Problem: Check if a number is an Armstrong (Narcissistic) number

// Definition:
// A number is an Armstrong number if:
// Sum of (each digit ^ total number of digits) = original number

// Example:
// 153 → 1³ + 5³ + 3³ = 153 → true

// Task:
// Given an integer n, return true if it is an Armstrong number, else false.
import java.lang.Integer;
public class Day_03 {
    static boolean Armstrong(int n){
      int original = n;  
      int  result = 0;

        while (n!=0) {
           int last_digit = n%10;
        if (result > Integer.MAX_VALUE || result == Integer.MAX_VALUE && last_digit > 7 ) {
            return false;
        }
        if (result < Integer.MIN_VALUE || result == Integer.MIN_VALUE && last_digit < -8 ) {
            return false;
        }

           result+=(last_digit*last_digit*last_digit);
            n/=10;
        }
       if (result == original) {
          return true;
       }else{
        return false;
       }
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (Armstrong(num)) {
           System.out.println("yes"); 
        }else{
            System.out.print("no");
        }
    }
}
