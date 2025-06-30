import java.util.*;

public class SortUsingTreeSet {
    public String [] arr1={"a","c","b","a","e"};
    public void sort() {
        Set<String> s1 = new LinkedHashSet<>(Arrays.asList(arr1));
        System.out.println("Set "+s1);
        Set<String> s2 = new TreeSet<>(s1);
        System.out.println("Sorted Set "+s2);
    }
    public static void main(String[] args) {
        SortUsingTreeSet si= new SortUsingTreeSet();
        si.sort();
    }
}