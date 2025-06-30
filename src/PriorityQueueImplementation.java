import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {

    public static void main(String[] args)
    {

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(5);
        pQueue.add(25);
        pQueue.add(20);
        pQueue.add(30);


        PriorityQueue<Character> pqc = new PriorityQueue<>(Comparator.reverseOrder());
        pqc.add('B');
        pqc.add('C');
        pqc.add('A');
        pqc.add('B');
        pqc.add('b');
        pqc.add('a');
        pqc.add('d');
        pqc.add('c');

        System.out.println("Default Priority Queue: " + pQueue);

        System.out.println("Reversed Priority Queue: " + pqc);

        pqc.offer('F');
        pqc.remove('d');
        System.out.println("Character Priority Queue after applying offer & remove: " + pqc);

        System.out.println("Priority Queue After Poll: " + pqc);

        System.out.println("Priority Queue After Peek: " + pqc);

        System.out.println("Priority Queue After Element: " + pqc);
    }
}
