package OOPS1.Example0038;

class Employee{
    int age;
    int id;
    double salary;
    String name;
    public void PrintDetail(){
        System.out.println("My Name is " + name);
        System.out.println("My salary is " + salary);
    }
    public int display(){
        return age;
    }
}
public class lecture38 {
    static void main() {
Employee e = new Employee();
Employee d = new Employee();
e.name = "Pawan Yadav";
e.id = 101;
e.salary = 45000;
e.age = 21;

d.name = "Deepak";
d.id = 102;
d.age = 22;
d.salary = 4500;


e.PrintDetail();
d.PrintDetail();

int k = e.age;
        System.out.println("Age is "+k);
    }
}
