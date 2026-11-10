package OOPS1.Example39;

class Employee {
    String name;
    int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class lecture38 {
    static void main() {
        Employee e = new Employee();
        e.setName("Pawan yadav");
        e.Salary = 22000;
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
