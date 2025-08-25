//Reverse an array

public class ReverseArray {
    static void reverse(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++; j--;
        }
    }
}
