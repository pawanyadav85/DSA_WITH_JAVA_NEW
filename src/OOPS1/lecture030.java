package OOPS1;

public class lecture030 {
     int logic(int x , int y){
        int z;
        if(x < y){
            z = x + y;
        }else {
            z = x + y * 5;
        }
        return z;
    }
    static void main() {
        int a = 8;
        int b = 9;
        int c;
        lecture030 l = new lecture030();

         l.logic(a , b);
        System.out.println(l);

        int c1 = l.logic(3 ,9);
       System.out.println(c1);

       l.logic(2,4);
        System.out.println(l.logic(3,4));
    }
}
