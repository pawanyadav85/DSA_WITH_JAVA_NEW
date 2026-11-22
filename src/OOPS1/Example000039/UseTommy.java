package OOPS1.Example000039;

class Tommy{
    public void hit(){
        System.out.println("Eneemy hitting ....");
    }
    public void fire(){
        System.out.println("Eneemy is fireing...");
    }
    public void run(){
        System.out.println("Eneemy id  runnig ...");
    }
}
public class UseTommy {
    static void main(String[] args) {
        Tommy t  = new Tommy();
        t.run();
        t.fire();
        t.hit();
    }
}
