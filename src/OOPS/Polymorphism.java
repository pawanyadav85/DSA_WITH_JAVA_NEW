package OOPS;

public class Polymorphism {
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static class Dog{
        void speak(){
            System.out.println("Bhaw Bhaw ");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("miyu miyu ");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Hrrr");
        }
    }
    static void main(String[] args) {
      Human h = new Human();
      Dog d = new Dog();
      Cat c = new Cat();
      Lion l = new Lion();

      h.speak();
      d.speak();
      c.speak();
      l.speak();
    }
}
