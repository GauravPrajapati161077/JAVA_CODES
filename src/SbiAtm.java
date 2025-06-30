import java.lang.classfile.Interfaces;
interface AtmInterface {
    void deposit(float amount);
    void withdraw(float amount);
    void checkBalance();
}

class SbiAtm implements AtmInterface{
    float balance=0;
    int transactionFee=5;
    public void deposit(float amount){
        balance+=amount;
        System.out.println("your balance after deposit "+balance);
    }
    public void withdraw(float amount){
        balance-=amount+transactionFee;
        System.out.println("your balance after withdraw "+balance);
    }
    public void checkBalance(){
        System.out.println("Current balance "+balance);
    }
}
