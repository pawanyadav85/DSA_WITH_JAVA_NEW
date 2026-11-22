package PrintLatter;

public class printB {
    static void main(String[] args) {
        int m = 7;
        int n = 4;
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if((i >= 2 && i <= 3 && j >= 2 && j <= 3) ||
                        (i >= 5 && i <= 6 && j >= 2 && j<= 3))
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
