public class Variable {
    static int staticVariable=1;
    int instanceVariable=8;
    public void var1(){
        int var=5;
        System.out.println(var);
    }
    public static void main(String[] args){
        System.out.println(staticVariable);
        Variable v = new Variable();
        v.var1();
        int a=v.instanceVariable;
        System.out.println(a);
    }
}

