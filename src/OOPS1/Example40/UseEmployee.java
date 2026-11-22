package OOPS1.Example40;

public class UseEmployee {
    static void main(String[] args) {
        Employee e = new Employee();
//        e.id = 104;
//        e.name = "Pawan Yadav";   exception occur due to acessMoidfiers
        e.setId(102);
        e.setName("Pawan yadav");
        System.out.println("Id of Employee " + e.getId());
        System.out.println("Name of Employee "+e.getName());
    }
}
