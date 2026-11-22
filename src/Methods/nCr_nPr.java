package Methods;

import java.util.Scanner;

public class nCr_nPr {
    static int  fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
//        int nfact = 1;
//        for (int i = 1; i <= n; i++) {
//            nfact *= i;
//        }
//        int rfact = 1;
//        for (int i = 1; i <= r; i++) {
//            rfact *= i;
//        }
//        int nMinusRfact = 1;
//        for (int i = 1; i <= n - r; i++) {
//            nMinusRfact *= i;
//        }
//        int NCR = nfact / (rfact * nMinusRfact);
int nCr = fact(n) / (fact(r) * fact(n - r));
int nPr = fact(n) / fact (n- r);
        System.out.println(nCr + "\n"   + nPr);
    }
}
