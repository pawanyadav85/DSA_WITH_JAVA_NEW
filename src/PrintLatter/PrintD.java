package PrintLatter;

public class PrintD {
    static void main(String[] args) {
        int m = 5;
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= m ; j++) {
                if((i >= 2 && i <= 4 && j== 1)
                 || (i >= 2 && i <= 4 && j >= 3 && j<= 4))
                {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
