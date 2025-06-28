import java.util.Scanner;
public class Repeatation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = num;
        int k = in.nextInt();
        int count = 0;
        while(num > count){
            int rem = num % 10;
            if(rem == k){
                count++;
            }
            num = num/10;
        }
        System.out.println("The Number "+ k + " is: "+ count+ " times in "+ i);
    }
}
