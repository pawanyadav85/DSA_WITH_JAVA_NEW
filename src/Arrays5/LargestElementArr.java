package Arrays5;

public class LargestElementArr {
    static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int [] arr = {23 , 12 ,24 , 56 ,67 , 89, 26};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum : "+ max);

    }
}
