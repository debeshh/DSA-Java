import java.util.Scanner;
public class StringArg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Ename = in.nextLine();
        String op = args(Ename);
        System.out.println(op);
    }

    static String args(String name){
        String message = "Hello " + name;
        return message;
    }
}
