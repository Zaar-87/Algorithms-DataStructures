import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedListHW list = new LinkedListHW();

        for (int i = 0; i < 15; i++)
            list.add(new Random().nextInt(20));
        
        System.out.print("Origin list:\n");
        list.print();

        //needed function
        list.reverseMyFunc();      
        System.out.print("Reversed list based on my func:\n");       
        list.print();

        list.reverseSemFunc();      
        System.out.print("Reversed list based on seminar func:\n");       
        list.print();      
    }
}