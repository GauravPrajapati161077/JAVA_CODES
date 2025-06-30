import java.util.*;

public class Sortlist {
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
    public void sort1(){
        ArrayList<Integer> sl= new ArrayList<>(listinput());
        Collections.sort(sl);
        ArrayList<Integer> ls=new ArrayList<>(sl);
        Collections.sort(sl,Collections.reverseOrder());
        System.out.println("Sorted list in Ascending order "+ls);
        System.out.println("Sorted list in Decending order "+sl);
    }
    public static void main(String[] args) {
        Sortlist sl = new Sortlist();
        sl.sort1();
    }
}
