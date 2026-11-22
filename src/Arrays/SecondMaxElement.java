package Arrays;

public class SecondMaxElement {
    static void main(String[] args) {
        int [] arr = {2,3,4,5,67,78,6};
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        //first maximum
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //second of maximum
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > sMax && arr[i] != max){
                sMax = arr[i];
            }
        }
        System.out.print(max +" ");
        System.out.print(sMax +" ");
    }
}
