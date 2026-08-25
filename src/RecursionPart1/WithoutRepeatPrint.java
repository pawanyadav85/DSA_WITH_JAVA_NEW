package RecursionPart1;

public class WithoutRepeatPrint {
    static void main(String[] args) {
        int n = 5;
        pawan(n);
    }
    public static void pawan(int n ){
        if(n == 0){
            return ;
        }
        if(n != 1)
        System.out.println(n);
        pawan(n - 1);
        System.out.println(n);
    }
}
