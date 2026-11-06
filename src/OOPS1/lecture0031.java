package OOPS1;

public class lecture0031 {
    static int change(int a ){
         a = 45;
         return a;
    }
     static void Print(){

         System.out.println("Hello word i am larning method and oops ");
    }
    static void main()
    {
         Print();
         int x = 300;
         change(x);
        System.out.println("change after copy " + x);
    }
}
