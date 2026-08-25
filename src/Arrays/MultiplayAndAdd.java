package Arrays;

public class MultiplayAndAdd {
    static void main(String[] args) {
        int [] arr = {4,5,6,7,8,9,1,};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 ==1){
                arr[i] *=2;
                System.out.print(arr[i] +" ");
            }else if(arr[i] % 2 ==0){
                arr[i] += 10;
                System.out.print(arr[i] + " ");
            }
        }
    }
}
