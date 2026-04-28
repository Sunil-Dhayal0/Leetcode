// Given a signed 32-bit integer x, return x with its digits reversed.
//  If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
import java.lang.Integer;

public class Day_02 {


     public static int reversed(int n){
              
           int reversed_num = 0;

        while (n!=0) {
            int last_digit = n%10;
            
            if ((reversed_num > Integer.MAX_VALUE/10)|| (reversed_num == Integer.MAX_VALUE/10 && last_digit > 7 )) {
                return 0;
            }
            if ((reversed_num < Integer.MIN_VALUE/10) || (reversed_num == Integer.MIN_VALUE/10 && last_digit < -8)) {
                return 0;
            }

            reversed_num =  reversed_num*10 +last_digit;
            n/=10;
        }
        
        return reversed_num;

     }



    public static void main(String[] args) {

        // int n = Integer.MIN_VALUE;
        // 2147483647    -2147483648
        int n = Integer.parseInt(args[0]);
        int  ans = reversed(n);
        if (ans != 0) {
            System.out.println(ans);
        }else{
            System.out.println("under/over flow");
        }
        
    }
}