package Arrays;

import java.util.Scanner;

public class LinearSearchInputByUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,3,4,5,6,6,78,9};
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target ){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Exist");
        }else{
            System.out.println("Not");
        }
    }
}
