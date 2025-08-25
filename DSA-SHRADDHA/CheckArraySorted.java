import java.util.*;
public class CheckArraySorted {
    static boolean isSorted(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
}



//Optimized (single pass)


// public class IsSorted {
//     static boolean isNonDecreasing(int[] a) {
//         for (int i = 1; i < a.length; i++) {
//             if (a[i] < a[i - 1]) return false;
//         }
//         return true;
//     }
// }