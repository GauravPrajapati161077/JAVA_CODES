import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mappractice {
    public void map(){
        Map<String,Integer> tm= new HashMap<>();
        tm.put("akash", 1);
        tm.put("Akash", 2);
        tm.put("Ravi",3);
        tm.put("Rishabh",null);
        tm.put("",3);
        tm.put("Unnati",5);
        tm.put(null,null);
        tm.put(null,6);
        System.out.println(tm);
    }

    public static void main(String[] args) {
        Mappractice mpp= new Mappractice();
        mpp.map();
    }
}
