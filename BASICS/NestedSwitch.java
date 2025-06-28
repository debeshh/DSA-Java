import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter Operation like: + - * /");
      char var2 = var1.next().trim().charAt(0);
      System.out.println("Enter Three Numbers: ");
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      int var6 = var1.nextInt();
      int var5 = 0;
      if (var2 == '+' || var2 == '-' || var2 == '/' || var2 == '*') {
         switch (var2) {
            case '*':
               var5 = var3 * var4;
               break;
            case '+':
               var5 = var3 + var4;
               break;
            case ',':
            case '.':
            default:
               System.out.println("Enter Valid Operation");
               break;
            case '-':
            char var7 = var1.next().trim().charAt(0);
            if (var7 == '+' || var7 == '-' || var7 == '/' || var7 == '*') {
                switch(var7){
                case '+' :
                var5 = var6 + var3;
                System.out.println(var5);
                break;
                default :
                System.out.println("Fault");
            }
        }
            
               var5 = var3 - var4;
               break;
            case '/':
               if (var4 != 0) {
                  var5 = var3 / var4;
               } else {
                  System.out.println("Cant divide by 0");
               }
         }

         System.out.println("The answer is: " + var5);
      }
    }
}
