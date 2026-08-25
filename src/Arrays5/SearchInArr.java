package Arrays5;

import java.util.Scanner;

public class SearchInArr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {3, 5, 6, 7, 9, 8, 45, 34};
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]){
                System.out.println("fount");
                break;
            }else {
                System.out.println("not");
            }
        }
    }
}
