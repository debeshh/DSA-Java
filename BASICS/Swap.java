public class Swap {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =20;
        System.out.println("a= "+num1+"b="+num2);
        swap(num1,num2);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= "+a+"b="+b);
    }
}
