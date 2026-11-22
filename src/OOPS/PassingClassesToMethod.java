package OOPS;

public class PassingClassesToMethod {
    public static class Car{
        String name;
        double size;
        int length;
        int seat;

    }
    static void main(String[] args) {
        Car c = new Car();
        c.name = "Thar";
        c.size = 177.5;
        c.length = 5;
        c.seat = 7;

        change(c);

        System.out.println(c.length);
    }
    public static void change (Car c){
        c.length = 10;
    }
}
