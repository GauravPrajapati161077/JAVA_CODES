public class Animal {
    private String type = "Animal";

    int legs = 4;

    protected String sound = "Roar";

    public boolean isWild = true;

    public String getType(){
        return type;
    }
}
class Dog extends Animal{

}
class Output{
    public static void main(String[] args) {
        Dog a= new Dog();
        System.out.println("no. of legs " +a.legs);
        System.out.println("sound of animal " +a.sound);
        System.out.println("type of animal " +a.isWild);
        System.out.println("type of living being " +a.getType());
    }
}
