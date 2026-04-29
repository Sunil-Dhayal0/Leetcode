// import java.util.Scanner;
// import java.lang.Integer;


public class Day_04 {
// Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.


  public static void sort(int []arr){
       
     for (int i = 0; i < arr.length-1; i++) {

        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j] > arr[j+1]){
             int temp = arr[j];
             arr[j]   = arr[j+1];
             arr[j+1] = temp;
            }
        }

     }


  }



    public static void main(String[] args) {

      int array[] = {6,2,4,8,3};

    sort(array);

    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }


    }
}