package Revision.revision3;

public class Programmer {
    Laptop l = new Laptop();
    void wirte(){
        boolean res = l.start();
        if(res){
            System.out.println("Programmer write the code");
        }else{
            System.out.println("Programmer not write the code");
        }
    }
}
