import java.util.Scanner;

public class VoteEligibility {
    int age;
    Boolean citizen;

    public void eligibility() {
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();
        citizen =sc.nextBoolean();
        if(age>18 && citizen==true){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }

    public static void main(String[] args) {
        VoteEligibility ve= new VoteEligibility();
        ve.eligibility();
    }
}
