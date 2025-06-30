import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDublicate {
    public ArrayList listinput(){
        ArrayList<Integer> al= new ArrayList<>();
        System.out.println("Enter the no of elments ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter elements ");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            al.add(element);
        }
        System.out.println("List with duplicate "+al);
        return al;
    }
    public void remove(){
        Set<Integer> s=new HashSet<>(listinput());
        System.out.println("Cleaned list "+s);
    }

    public static void main(String[] args) {
        RemoveDublicate rd = new RemoveDublicate();
        rd.remove();
    }
}
