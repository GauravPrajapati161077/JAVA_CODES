import java.util.HashMap;

class Hashmap {
    public static void main(String[] args) throws InterruptedException  {
        Thread t = new Thread(() -> {
            System.out.println("Inside thread: " + Thread.currentThread());
        });
        System.out.println("new th");
        t.start();
        t.setName("MyCustom");
    }
    }
