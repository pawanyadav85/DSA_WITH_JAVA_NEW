package OOPS;
class Student{
    String name;
    int roll;
   private double cgpa = 7.5;
    private /*private / public */ void print(){
        System.out.println(name + " "+ cgpa +" "+ roll);
    }
    public void p(){
       print();
    }
}
public class PrivateKeyword1 {
    static void main(String[] args) {
        Student s = new Student();
        s.p();
        s.name = "Pawan Yadav";
        s.roll = 7345;
        //s.cgpa = 7.5;
        s.p();

        Student s1 = new Student();
        s1.p();

    }
}
