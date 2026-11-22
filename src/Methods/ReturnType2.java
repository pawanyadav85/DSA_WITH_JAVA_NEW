package Methods;

public class ReturnType2 {
    static int print(int a ) {
        System.out.println("Radhe");
        if(a > 0 ){
            return 5;
        }else{
            return 10;
        }
    }
    static void main(String[] args) {
        int x = print(7);
        System.out.println(3 + x);
    }
}
