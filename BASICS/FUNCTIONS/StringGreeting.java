import java.util.Scanner;
public class StringGreeting {
    public static void main(String[] args) {
        String message = str();
        System.out.println(message);
    }

    static String str(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.nextLine();
        return name;
    }
}
