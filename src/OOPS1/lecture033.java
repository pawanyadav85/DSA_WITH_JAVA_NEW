package OOPS1;

public class lecture033 {

     static int sum(int... arr){;
         int add = 0;
        for(int x : arr){
            add += x;
        }
        return add;
    }

    static void main(){
        System.out.println("Welcome to vararg tutorial");
        System.out.println("sum is " + sum(2 , 6));
        System.out.println("sum is " + sum(2 ,3, 4));
        System.out.println("sum is " + sum(2 , 6 , 4,5));
    }
}
