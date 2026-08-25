package Arrays5;

import java.util.Scanner;

public class TwoSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int [] arr = {4,5,6,7,8,32,5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j + 1 < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("found Target");
                }
            }
            System.out.println("not found target ");
        }
    }
}
