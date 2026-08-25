package src.OOPS;

class Animal {
    int power;
    String type;

    Animal(String type, int power) {
        this.power = power;
        this.type = type;
    }

    Animal() {}

    void print() {
        System.out.println(power + " " + type);
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Animal a = new Animal("Lion", 100);
        a.print();
    }
}
