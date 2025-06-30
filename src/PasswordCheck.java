import java.util.Scanner;

public class PasswordCheck {
    String password;
    int lowerChar=0,upperChar=0,specialChar=0,digit=0;
    Scanner sc=new Scanner(System.in);
    public void password(){
        System.out.println("Enter password");
        password=sc.nextLine();
        for(int i=0;i <password.length();i++){
            char c=password.charAt(i);
            if(Character.isUpperCase(c)){
                upperChar++;
            } else if (Character.isDigit(c)) {
                digit++;
            } else if (!Character.isLetterOrDigit(c)) {
                specialChar++;
            }else {
                lowerChar++;
            }
        }
        if(password.length()>9 && upperChar>0 && digit>0 && specialChar>0){
            System.out.println("Password is strong");
        }else{
            System.out.println("Password is weak");
        }
    }

    public static void main(String[] args) {
        PasswordCheck pc= new PasswordCheck();
        pc.password();
    }
}
