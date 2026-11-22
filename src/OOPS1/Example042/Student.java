package OOPS1.Example042;

public class Student {
    int id;
    String name;
    //No argument of cunstructor
    Student(){
        id = 103;
        name = "Pawan yadav";
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
    // perametrized Constructor
    Student(int i ){
        id = i;
    }
    //Constructor overloading
    Student(int i , String n){
        id = i;
        name = n;
    }
}
