package Revision.revision5;

public class UseProgrammer {
    static void main(String[] args) {
        Laptop l = new Laptop("Asus VivoBook ", 65000);
        Programmer p = new Programmer(l);
        p.writeCode();
    }
}
