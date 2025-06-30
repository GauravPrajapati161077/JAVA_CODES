import java.util.Scanner;

public class OddOrEven {
    int[] arr= new int[10];
    public void odddEven(){
        System.out.println("Enter no. in array");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for( int j : arr){
            if(j%2==0){
                System.out.println("Number " + j +"is even" );
            }
            else {
                    System.out.println("Number " + j +"is odd" );
            }
        }
    }

    public static void main(String[] args) {
        OddOrEven oe = new OddOrEven();
        oe.odddEven();
    }
}
