class HdfcAtm implements AtmInterface{
    float balance=0;
    float transactionFee=.02f;
    public void deposit(float amount){
        balance+=amount;
    }
    public void withdraw(float amount){
        balance-=amount-amount*transactionFee;
    }
    public void checkBalance(){
        System.out.println("Current balance "+balance);
    }
}
