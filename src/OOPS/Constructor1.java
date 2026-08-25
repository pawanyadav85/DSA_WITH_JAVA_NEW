package OOPS;

public class Constructor1 {
    public static class Car{
        int seat;
        String name;
        double length;

        Car(int x,String s , double d){
            seat = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seat +" "+name+" "+length);
        }
    }
    static void main(String[] args) {
      Car c1 = new Car(7,"Aulto",3.55);
      c1.print();
      Car c2 = new Car(8,"tata", 4.5);
      c2.print();
    }
}
