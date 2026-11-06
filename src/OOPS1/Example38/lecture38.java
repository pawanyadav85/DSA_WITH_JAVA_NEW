package OOPS1.Example38;

class Employee{
    int age;
    int id;
    double salary;
    String name;
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


        System.out.println("My Name is "+ e.name);
        System.out.println("My id is " + e.id);
        System.out.println("My Salary is "+e.salary);

        System.out.println("My Name is "+ d.name);
        System.out.println("My id is " + d.id);
        System.out.println("My Salary is "+d.salary);

        //Draw back of over code is in next code 038
    }
}
