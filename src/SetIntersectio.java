import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIntersectio {
   public Integer [] arr1={1,2,3,4,5};
    public Integer [] arr2={1,3,2};
    public void intersection() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(arr2));
        System.out.println("Set1 "+s1);
        System.out.println("Set2 "+s2);
        s1.retainAll(s2);
        System.out.println("Intersection "+s1);
    }
    public static void main(String[] args) {
        SetIntersectio si= new SetIntersectio();
        si.intersection();
    }
}
