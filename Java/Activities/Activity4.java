package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {

        int[] card_arr = {4, 3, 2, 10, 12, 1, 5, 6};
        for (int i = 0; i < card_arr.length; i++) {
            System.out.println("array before=" + card_arr[i]);
        }
        sorting(card_arr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(card_arr));

    }

    public static void sorting(int array[]) {
        int[] SortedArray = {};
        int temp = 0;
        for (int i = 1; i < array.length ; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
j--;
            }
                array[j+1] = temp;

//            SortedArray[i]=array[j-1];
        }
    }
}


