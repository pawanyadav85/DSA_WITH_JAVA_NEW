package Arrays1;

public class binarysearch {
    static void main(String[] args) {
        int []arr = {3,4,5,5,7,77,78};

        int s= 0;
        int e=6;

        int target = 7;


       while(s < e) {

           int mid = (s + e) / 2;
           if(arr[mid]< target){

           s = mid + 1;
       }else if(arr[mid] > target){
               e = mid - 1;
           }
           else{
               System.out.println("Answer = "+arr[mid]);
           }


       }


        }
    }
