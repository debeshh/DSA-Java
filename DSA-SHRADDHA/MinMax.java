//Find max & min element in an array

public class MinMax {
    static int[] minMax(int[] a) {
        if (a == null || a.length == 0) throw new IllegalArgumentException("empty array");
        int mn = a[0], mx = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < mn) mn = a[i];
            if (a[i] > mx) mx = a[i];
        }
        return new int[]{mn, mx};
    }
}