import java.util.*;

public class DiffInHashAndTreeSet {
    public String [] arr1={"a","c","b","a","e"};
    public void difference() {
        Set<String> s1 = new HashSet<>();
        s1.add("b");
        s1.add("a");
        s1.add("d");
        s1.add("zebra");
        s1.add("1");
        System.out.println("Set "+s1);
        Set<String> s2 = new TreeSet<>(s1);
        s2.add("b");
        s2.add("a");
        s2.add("d");
        s2.add("c");
        System.out.println("Sorted Set "+s2);
    }
    public static void main(String[] args) {
        DiffInHashAndTreeSet si= new DiffInHashAndTreeSet();
        si.difference();
    }
}
