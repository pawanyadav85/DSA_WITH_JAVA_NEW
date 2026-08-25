package Basic_Shorting;

import java.util.Arrays;

public class CommonElement {
        static void main(String[] args) {
            int[] a = {3,4,5,6,7};
            int[] b = {4,5,9,8,7};
            Arrays.sort(a);
            Arrays.sort(b);
            int[] c = new int[a.length + b.length];
            int i = 0 , j = 0;
            while(i < a.length && j < b.length){
                if(a[i] == b [j]){
                    System.out.print(a[i] + " ");
                    i++;
                    j++;
                }else if(a[i] > b[j]){
                    j++;
                }else{
                    i++;
                }
            }
        }
    }

