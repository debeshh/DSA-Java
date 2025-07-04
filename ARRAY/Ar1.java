import java.util.*;

public class Ar1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // for(int i=0 ;i<arr.length ; i++){
        //     arr[i] = in.nextInt();
        // }
        // System.out.print(Arrays.toString(arr));
        int[][] arr2D = new int[3][3];
        int row,col;
        for(row = 0; row < arr2D.length ; row++){
            for(col = 0 ; col < arr2D[row].length; col++){
                arr2D[row][col] = in.nextInt();
            }
        }
        // for(row = 0; row < arr2D.length ; row++){
        //     for(col = 0 ; col < arr2D[row].length; col++){
        //         System.out.print(arr2D[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for(row =0 ; row < arr2D.length; row++){
        //     System.out.println(Arrays.toString(arr2D[row]));
        // }

        for(int[] a : arr2D){
            System.out.println(Arrays.toString(a));
        }

    }
}
