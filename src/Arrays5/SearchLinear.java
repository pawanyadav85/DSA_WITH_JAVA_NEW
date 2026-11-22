package Arrays5;

import java.util.Scanner;

public class SearchLinear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 67, 8, 3, 5, 6, 7, 84, 3,};
        int target = sc.nextInt();
        boolean flag = true ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag == true ){
            System.out.println("Target Exist in Array " );
        }else{
            System.out.println("Target missing in Array");
        }
    }
}