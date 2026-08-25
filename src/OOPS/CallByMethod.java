package OOPS;

public class CallByMethod {
    public static class Student{
        String name;
        int age;
        double height;
        char blood ;
           void print(Student s){
              System.out.println("Name : "+ s.name + " , Age " + s.age  + " ,Height :  " + s.height + ", Blood Group " + s.blood );

          }
    }
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pawan Yadav";
        s1.age = 20;
        s1.height = 175.4;
        s1.blood = 'O';

        Student s2 = new Student();
        s2.name = "Radha Yadav";
        s2.age = 21;
        s2.height = 170.4;
        s2.blood = 'A';

        Student s3 = new Student();
        s3.name = "Ram Yadav";
        s3.age = 22;
        s3.height = 177.4;
        s3.blood = 'B';

//        s1.print(s1);
//        s2.print(s2);
//        s3.print(s3);
    }
}
