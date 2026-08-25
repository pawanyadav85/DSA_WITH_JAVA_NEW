package Arrays;

import java.util.Scanner;

public class InputValueByUser {


        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] pawan = new int[7];
            //input
            for (int i = 0; i < 7 ; i++) {
                pawan[i] = sc.nextInt();
            }
//output
            for (int i = 0; i < 7; i++) {
                System.out.print(2*pawan[i] +" ");
            }
        }
    }

