import java.util.Scanner;

public class LeapYear {
    public void leapYearCal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            System.out.println("Year is leap year");
        } else {
            System.out.println("Year is not a leap year");
        }
    }

    public static void main(String[] args) {
        LeapYear lp=new LeapYear();
        lp.leapYearCal();
    }
}
