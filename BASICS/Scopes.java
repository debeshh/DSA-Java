public class Scopes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a=30;
            int c = 40;
            System.out.println(a);
        }
        int c =50;
        System.out.println(c);
        System.out.println(a);

    }
}
