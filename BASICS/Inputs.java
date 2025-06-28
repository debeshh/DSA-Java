import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        input.nextLine(); //consume the leftover newline
        String name = input.nextLine();
        System.out.println("Your Roll no is : "+ rollno);
        
        System.out.println("Name:"+ name);
    }
}