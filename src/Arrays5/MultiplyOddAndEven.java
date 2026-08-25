package Arrays5;

public class MultiplyOddAndEven {
    static void main(String[] args) {
        int [] arr = {4,5,7,3,5,6,8,3};
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                arr[i] += 10 ;
                System.out.print(arr[i] + " ");
            }else{
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
            }
        }
    }
}
