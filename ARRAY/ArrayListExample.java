import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(6);
        // list.add(67);
        // list.add(68);
        // list.add(69);
        // list.add(70);
        // list.add(71);
        // list.add(72);
        // list.add(69);
        // list.add(70);
        // list.add(71);
        // list.add(72);

        // System.out.println(list.contains(72));
        // list.set(0,98);
        // System.out.println(list);


        for (int i = 0; i < 6; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
