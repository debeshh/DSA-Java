import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Operation like: + - * /");
        char op = in.next().trim().charAt(0);
        System.out.println("Enter Two Numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;

        if (op == '+' || op == '-' || op == '/' || op == '*') {
            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cant divide by 0");
                    }
                    break;
                default:
                    System.out.println("Enter Valid Operation");
            }
            System.out.println("The answer is: " + ans);
        }
    }
}
