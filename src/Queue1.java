import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

    public static void main(String args[])
    {        Queue<String> q = new LinkedList<>();
        q.add("A");
        q.add("B");
        q.add("C");
        System.out.println("Queue elements: " + q);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println("Queue elements: " + q);
    }
}