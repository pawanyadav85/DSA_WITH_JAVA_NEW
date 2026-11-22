<<<<<<< HEAD
package OOPS;
=======
package src.OOPS;
>>>>>>> 82128e0d6c2d2887fcdc22f74a717a69f6668d3f

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

<<<<<<< HEAD
    static void main(String[] args) {
=======
    public static void main(String[] args) {
>>>>>>> 82128e0d6c2d2887fcdc22f74a717a69f6668d3f
        Animal a = new Animal("Lion", 100);
        a.print();
    }
}
