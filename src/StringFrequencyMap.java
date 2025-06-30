import java.util.HashMap;
import java.util.Map;

public class StringFrequencyMap {
    String s="hello world";
     public void charCount(){
        char[] c=s.toCharArray();
         Map<Character, Integer> m= new HashMap<>();
         for(char c1:c){
             if (c1 == ' ') {
                 continue;
             }
             m.put(c1,m.getOrDefault(c1,0)+1);
         }
         System.out.println("frequenc map "+m);
     }

    public static void main(String[] args) {
        StringFrequencyMap sfm=new StringFrequencyMap();
        sfm.charCount();
    }
}
