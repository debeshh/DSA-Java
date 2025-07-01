public class Shadowing {

    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        func();
    }

    static void func(){
        System.out.println(x);
    }
}

