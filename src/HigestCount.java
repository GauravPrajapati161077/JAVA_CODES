import java.util.ArrayList;
import java.util.Scanner;

public class HigestCount {
    public ArrayList<Integer> listinput(){
        ArrayList<Integer> al= new ArrayList<>();
        System.out.println("Enter the no of elments ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter elements ");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            al.add(element);
        }
        System.out.println("List "+al);
        return al;
    }
    public void count(){
        ArrayList<Integer> num= new ArrayList<>(listinput());
        int a=num.get(0),c=0,mc=0;
        for(int i=0;i< num.size();i++){
            c=0;
            for(int j=0;j< num.size();j++){
                if(a==num.get(j)){
                    c++;
                }
            }if(mc<c){
                mc=c;
                a=num.get(i);
            }
        }
        System.out.println("No. which has max count is "+a+" and count is "+mc);
    }

    public static void main(String[] args) {
        HigestCount hc= new HigestCount();
        hc.count();
    }
}
