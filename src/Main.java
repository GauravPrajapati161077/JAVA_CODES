//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          SbiAtm sb= new SbiAtm();
          HdfcAtm hd = new HdfcAtm();
          IciciAtm ic = new IciciAtm();
          sb.deposit(500.0f);
          sb.withdraw(300.f);
          sb.checkBalance();
        hd.deposit(1000.0f);
        hd.withdraw(500.f);
        hd.checkBalance();
        ic.deposit(2000.0f);
        ic.withdraw(300.f);
        ic.checkBalance();
        }

}