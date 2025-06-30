import java.util.Collections;
import java.util.PriorityQueue;

public class Prioritynull {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("ab");
        pq.add("cd");
        pq.add("ac");
        pq.add("de");
        pq.add(null);
        System.out.println(pq);
    }
}
