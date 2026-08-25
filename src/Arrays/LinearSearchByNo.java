package Arrays;

public class LinearSearchByNo {
    static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8,89,3,4,5,};
        int target = 4;
        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                found = i;
            }
        }
        if(found != -1){
            System.out.println("Exist in arrays at - " + found);
        }else{
            System.out.println("Not EXist in Arrays - ");
        }
    }
}
