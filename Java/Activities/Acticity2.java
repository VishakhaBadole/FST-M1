package activities;

public class Acticity2 {
   public static void main(String[] args) {
       int[] a_array = {10, 77, 10, 54, -11,10,10};
       int count = 0;
       System.out.println("finalResults is:"+ check(a_array, count));
   }
   public static boolean check (int [] a_array, int count) {
       int total=0;

       for (int num : a_array) {
           if (num == 10)
               count = count + 1;
       }
    total =count*10;
              if (total == 30) {
       }return total == 30;
   }
   }

//    Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
//    Find the 10's in the array and add them
//    Check if value is equal to 30.

