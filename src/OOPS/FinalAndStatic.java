package OOPS;
class Cricketer{
    String country = "Newzland";
    int runs ;
    String  name;
    double avg;
}
public class FinalAndStatic {
    static void main(String[] args) {
        Cricketer c1 = new Cricketer();
      //  c1.country = "Enland";      Error

        Cricketer c2 = new Cricketer();
        c1.country = "India";
        System.out.println(c1.country);
    }
}
