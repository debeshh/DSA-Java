
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1, 9, 5, 6, 7, 8};
        // max(arr);
        // swap(arr,0,3);
        
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }


    static void max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("max is: "+ max);
    }




    //twoPointer problem
    static void reverse(int[] arr){
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
    }

    static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
