import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter the Number: ");
        // int n = in.nextInt();
        // System.out.println(isArmstrong(n));

        for(int i =100;i< 1000; i++){
        if(isArmstrong(i)){
            System.out.print(i + " ");
        }
    }
    }
    
    static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return temp == sum ;
        // if (temp == sum) {
        //     return true;
        // } else
        //     return false;
    }
}
