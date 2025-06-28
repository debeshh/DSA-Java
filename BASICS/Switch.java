import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of Fruits");
                break;
            case "apple":
                System.out.println("Red fruit");
                break;
            case "banana":
                System.out.println("Protein Fruit");
                break;
            default:
                System.out.println("Apple a Day keeps the Doctor away");
        }
    }
}
