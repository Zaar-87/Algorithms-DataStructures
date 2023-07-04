import java.util.Random;

public class Main {
    public static void main(String[] args) {
       
        BinTree<Integer> tree = new BinTree<>();
                // random value tree filling
            // for (int i = 0; i < 15; i++)
            //     tree.add(new Random().nextInt(20));        
        tree.add(1);
        tree.add(3);
        tree.add(2);
        tree.add(6);
        tree.add(4);
        tree.add(0);
        tree.add(7);
        tree.add(8);

        tree.print();
    }      
}
