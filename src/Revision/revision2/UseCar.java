package Revision.revision2;

public class UseCar {
    static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "BMW";
        c1.price = 1200000;

        c1 = c2;

        System.out.println(c1.brand);
        System.out.println(c1.price);

        c2.brand = "audi";
        c2.price = 1300000;
        System.out.println(c2.brand);
        System.out.println(c2.price);
    }
}
