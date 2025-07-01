import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = sum2(num1,num2);
        System.out.println("The Sum of Two Numbers is : "+ sum);

        
    }

    static int sum2(int a, int b) {
        int sum = a + b;
            // System.out.println("The Sum of two Numbers is: "+ sum);
        return sum;
    } 
}
