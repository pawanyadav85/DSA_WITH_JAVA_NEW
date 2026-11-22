package Arrays5;

public class PassingArrToMethod {
    static void main(String[] args) {
        int [] arr = {4,5,6,7,8,9};
        System.out.println(arr[2]);
     change(arr);
        System.out.println(arr[2]);
    }

    static void  change(int [] x) {
        x [2] = 100;
    }
  }
