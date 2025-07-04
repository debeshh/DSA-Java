import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number n: ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i*i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return i*i > n;
    }
}
