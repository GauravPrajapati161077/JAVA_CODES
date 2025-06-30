import java.util.Scanner;

public class SalaryCalculator {
    int bonus=1500;
    float sal,tax=0.2f,actualSalary;
    public void netSalary(){
        System.out.println("Enter Salary");
        Scanner sc= new Scanner(System.in);
        sal=sc.nextFloat();
        actualSalary=(sal-(sal*tax))+bonus;
        System.out.println("Salary after tax is "+actualSalary);
    }

    public static void main(String[] args) {
        SalaryCalculator o= new SalaryCalculator();
        o.netSalary();
    }
}
