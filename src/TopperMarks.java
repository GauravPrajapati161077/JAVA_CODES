import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopperMarks {
    public void studentMarks(){
        Map<String,Integer> sm= new HashMap<>();
        int mx=0;
//        int index;
        String s1="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details ");

        for(int j=0;j<5;j++) {
            System.out.println("enter name ");
            String s = sc.nextLine();
            System.out.println("Enter marks ");
            int i = sc.nextInt();
            sc.skip("\n");
            sm.putIfAbsent(s,i);
            if(mx<i){
                mx=i;
                 s1=s;
            }
        }
        System.out.println("Max marks are "+mx +"of "+s1);
    }

    public static void main(String[] args) {
        TopperMarks tm= new TopperMarks();
        tm.studentMarks();
    }
}
