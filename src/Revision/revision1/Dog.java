package Revision.revision1;

public class Dog extends Animal{
     void bark(){
        boolean res = super.sound();
        if(res){
            System.out.println("Dog is barking ");
        }else{
            System.out.println("Dog is not Barking");
        }
    }
}
