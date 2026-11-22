package OOPS1.Example039;

class Phones {
    public   void call() {
        System.out.println("Incoming calls...");
    }

    public  void ring() {
        System.out.println("Phones is Ringning...");
    }

    public  void vibrate() {
        System.out.println("Phones is Vibrating...");
    }
}

public class UsePhones {
    static void main(String[] args) {
        Phones p = new Phones();
        p.call();
        p.vibrate();
        p.ring();
    }
}
