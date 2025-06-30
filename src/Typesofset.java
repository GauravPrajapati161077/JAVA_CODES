import java.util.*;

public class Typesofset {
    public void hashset(){
        Set<String> hs= new HashSet<>();
        hs.add("Guava");
        hs.add("Apple");
        hs.add("Banna");
        hs.add("Lemon");
        System.out.println(" Hash Set "+hs);
    }
    public void hashlinkset(){
        Set<String> hl= new LinkedHashSet<>();
        hl.add("Guava");
        hl.add("Apple");
        hl.add("Banna");
        hl.add("Lemon");
        System.out.println("Linked hash set "+ hl);
    }
    public void treeset(){
        Set<String> ht= new TreeSet<>();
        ht.add("ab");
        ht.add("ga");
        ht.add("cd");
        ht.add("de");
        System.out.println("Tree Set "+ht);
    }

    public static void main(String[] args) {
        Typesofset ts = new Typesofset();
        ts.hashset();
        ts.hashlinkset();
        ts.treeset();
    }
}
