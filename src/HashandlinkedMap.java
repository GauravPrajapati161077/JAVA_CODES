import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashandlinkedMap {
    public void map(){
        Map<String,Integer> tm= new HashMap<>();
        tm.put("akash", 1);
        tm.put("Akash", 2);
        tm.put("Ravi",3);
        tm.put("Rishabh",null);
        tm.put("Aolo",3);
        tm.put("Unnati",5);
        Map<String,Integer> lm= new LinkedHashMap<>();
        lm.put("akash", 1);
        lm.put("Akash", 2);
        lm.put("Ravi",3);
        lm.put("Rishabh",null);
        lm.put("Aolo",3);
        lm.put("Unnati",5);
        System.out.println("Hash map "+tm);
        System.out.println("Linked Hash Map "+lm);
    }

    public static void main(String[] args) {
        HashandlinkedMap mpp= new HashandlinkedMap();
        mpp.map();
    }
}