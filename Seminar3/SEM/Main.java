import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 20; i++)
            list.add(new Random().nextInt(10));
        list.print();
        list.reverse();
        list.print();
    }
}