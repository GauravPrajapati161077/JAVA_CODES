import java.util.Scanner;

public class User {
    String userId,email;
    public void useridemail(String a, String b){
        this.userId=a;
        this.email=b;
    }
}
class Student extends User{
    String courseName;
    public void course(){
        System.out.println("enter course name");
        Scanner sc= new Scanner(System.in);
        courseName=sc.nextLine();
        System.out.println("User Id "+userId);
        System.out.println("Email "+email);
        System.out.println("Course name " + courseName);
    }

    public static void main(String[] args) {
        Student s= new Student();
        s.useridemail("Gaurav","gp@gmail");
        s.course();
    }
 }
