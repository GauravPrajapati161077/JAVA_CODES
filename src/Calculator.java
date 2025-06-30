import java.util.Scanner;

public class Calculator {
    String condition="y";
    public void cal() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first no.");
        int n1=sc.nextInt();
        System.out.println("enter second no.");
        int n2=sc.nextInt();
        while(condition.equals("y")) {
            System.out.println("Enter what do you want to do + for addition" +
                    "- for subtraction" +
                    "/ for division" +
                    "* for multiplication");

            char a=sc.next().charAt(0);
            switch(a){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
                default:
                    System.out.println("invalid input");
            }

            sc.nextLine(); // consume leftover newline
            System.out.println("To continue enter y, to exit press n:");
            condition = sc.nextLine();

        }

    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.cal();
    }
}
