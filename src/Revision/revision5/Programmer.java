package Revision.revision5;

public class Programmer {
    private final Laptop lp;
     Programmer(Laptop lp){
       this.lp = lp;
    }
    public void writeCode(){
        boolean res = lp.start();
                if(res){
                    System.out.println("Programmming started");
                }else{
                    System.out.println("Pragrammnig is not started");
                }
    }
}
