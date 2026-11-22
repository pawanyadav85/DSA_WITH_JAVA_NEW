package Arrays;

public class ZeroOne {
    static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1, 0, 0, 0, 0};
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

