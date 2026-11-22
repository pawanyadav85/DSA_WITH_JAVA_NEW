package Revision.revision4;

public class Programmer {
    private final Laptop lp;
    Programmer(){
        lp = new Laptop();
    }
    public void writecode(){
       boolean res =  lp.start();

        if(res){
            System.out.println("Laptop started ");
        }else{
            System.out.println("Laptop not atarted");
        }

    }
}
