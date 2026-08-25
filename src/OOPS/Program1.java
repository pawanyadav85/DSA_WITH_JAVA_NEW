package OOPS;

public class Program1 {
    public static class Student{
        String  name;
        int roll;
        int age;
        double cgpa;
        char blood;
    }
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pawan Yadav";
        s1.roll = 10430;
        s1.age = 20;
        s1.cgpa = 7.76;
        s1.blood = 'A';
        System.out.println("Student1 details are : " + s1.name +" Name" +  "Roll No  " + s1.roll + s1.age + s1.cgpa + s1.blood );
    }
}
