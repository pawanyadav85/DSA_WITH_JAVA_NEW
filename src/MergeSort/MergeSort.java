  package MergeSort;

public class MergeSort {

    static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};
        mergeSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void mergeSort(int[] arr) {

        // Step1  :  make two empty array
        int n = arr.length;
        if(n == 1){
            return;
        }
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // copy paste value
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        // Apply Magic
        mergeSort(a);
        mergeSort(b);
        // Merge The Element
        merge(a , b , arr);
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0 , j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }
    }
}

