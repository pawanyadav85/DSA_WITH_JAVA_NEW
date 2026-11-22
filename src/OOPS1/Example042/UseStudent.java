package OOPS1.Example042;

public class UseStudent {
    static void main(String[] args) {
        Student s1 = new Student();
       s1.display();
       //default constructor
        System.out.println("Default constructor");
        Student s2 = new Student();
        System.out.println(s2.id);
        System.out.println(s2.name);

        Student s3 = new Student(205);
        System.out.println(s3.id);

        Student s4 = new Student(1001 , "Rahul Yadav");
        System.out.println(s4.id +" " +s4.name);
    }
}
