public class Pattern {
    public void pattern1() {
        for (int i = 1; i<=4; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" " + (j+1));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern p=new Pattern();
        p.pattern1();
    }
}
