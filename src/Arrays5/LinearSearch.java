package Arrays5;

import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = {4,5,6,7,8,8,9};
        int target = sc.nextInt();
        int flag = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                flag = i;
                break;
            }
        }
        if(flag != -1){
            System.out.println("found : "  + flag);
        }else{
            System.out.println("Not");
        }
    }
}
