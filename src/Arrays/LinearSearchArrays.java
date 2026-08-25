package Arrays;

public class LinearSearchArrays {
    static void main(String[] args) {
        int [] arr = {1,3,3,4,5,6,7,8,9};
        int target = 78;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Exist in arrays at : " + i );
                found= true;
                break;
            }
        }
        if(found == false){
           System.out.println("Not Exist in Arrays");
        }
    }
}
