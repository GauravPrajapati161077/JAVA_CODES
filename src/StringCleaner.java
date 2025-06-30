import java.util.Scanner;

public class StringCleaner {
    String name;
    public void nameClean(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        name=sc.nextLine();
        name=name.trim();
        name=name.toLowerCase();
        name=name.replaceAll(" +"," ");
        System.out.println(name);
    }

    public static void main(String[] args) {
        StringCleaner sc=new StringCleaner();
        sc.nameClean();
    }
}
