import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArraylistoLinkedlist {
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
        System.out.println("List  "+al);
        return al;
    }
    public void conversion(){
        List<Integer> ll= new LinkedList<>(listinput());
        System.out.println("Converted linked list "+ll);

    }
    public static void main(String[] args) {
        ArraylistoLinkedlist atl = new ArraylistoLinkedlist();
        atl.conversion();
    }
}
