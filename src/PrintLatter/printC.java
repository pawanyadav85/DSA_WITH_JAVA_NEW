package PrintLatter;

public class printC {
    static void main(String[] args) {
        int m = 5;
        int n = 6;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4 ; j++) {
                if(i >= 2 && i <= 4 && j >= 2 && j <= 4){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
