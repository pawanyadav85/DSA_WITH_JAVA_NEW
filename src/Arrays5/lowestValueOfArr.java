package Arrays5;

public class lowestValueOfArr {
    static void main(String[] args) {
        int [] arr = {15,16,76,9,35,25,32};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
    }
}
