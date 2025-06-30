import java.util.Scanner;

public class GradingSystem {
    int n;
    public int arr(){
        System.out.println("enter no. of records");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
    public int[] input(int n){
        int[] arr= new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public void grade(int[] arr){
        for (int i=0;i<arr.length;i++) {
           int m = arr[i];

            if (m > 100 || m < 0) {
                System.out.println("Invalid score");
            } else if (m >= 90) {
                System.out.println("A");
            } else if (m >= 75) {
                System.out.println("B");
            } else if (m >= 50) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }
        }

    }

    public static void main(String[] args) {
        GradingSystem gs=new GradingSystem();
        gs.grade(gs.input(gs.arr()));
    }

}
