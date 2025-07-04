import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,0);
        multiple(1,3,"hello","debesh","hii");
    }

    static void multiple(int a, int b, String ...v){
        int x = a;
        int y = b;

        System.out.println(x +"y= "+  y + Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
