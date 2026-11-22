package Arrays;
import java.util.Arrays;
public class ShortArraysByBuiltin {
    static void main(String[] args) {
        int [] arr = {87,7,45,3,54,47,34,74};
        print(arr);         //call function
        //short acending order
        Arrays.sort(arr);   //direct short rule
        print(arr);      //call function
    }
   public static void print(int arr[]){
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]  +" ");
       }
       System.out.println();      //break the line
    }
}
