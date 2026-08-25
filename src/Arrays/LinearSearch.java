package Arrays;

public class LinearSearch {
    static void main(String[] args) {
        int [] arr = {1,2,3,3,5,6,7,9,10};
        int target = 11;
        boolean flag = false;   // False means target array me nhi hai
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){      //if that are arr=index do the condition true
                flag = true;  //True means target array me hai
                break;
            }
        }
        if(flag == true ){
            System.out.println("Arrays Exist");
        }else{
            System.out.println("Arrays not Exist");
        }
    }
}
