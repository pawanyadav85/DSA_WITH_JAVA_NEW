package Arrays;

public class SumTwo {
    static void main(String[] args) {
        System.out.println("Two Sum");
    }
    boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;
        for(int i = 0 ; i< arr.length; i++){
            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}

