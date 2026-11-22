package OOPS;

public class ParametrizeAndDefault {
    public static class Car{
        int price;
        String name;

        Car(){ // default constructor

        }
        Car(int x, String s){     // perameterize constructor
            price = x;
            name = s;
        }
        void print(){
            System.out.println(price +" "+name);
        }
    }
    static void main(String[] args) {
        Car c1 = new Car(1200,"Alto");
        c1.print();

        Car c2 = new Car(333333,"Rangerower");
        c2.print();
    }
}
