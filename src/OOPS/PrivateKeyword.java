package OOPS;
class Students{
    String name;
    private   int roll;
    double Cgpa;
}

public class PrivateKeyword {


    static void main(String[] args){
        Students s = new Students();
        System.out.println(s.name + " " + " "+ s.Cgpa );
        s.name = "Pawan Yadav";
        s.Cgpa = 7.76;
        System.out.println(s.name + " " + " "+ s.Cgpa);
    }
}
