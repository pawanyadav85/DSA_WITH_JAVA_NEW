package ArrayList1D;



public class MergeTwoShortedArr {
    static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 2, 4, 6, 8};
        int[] c = new int[a.length + b.length];
        merge(c, a, b);
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i == a.length){
            while(j < b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }else{
            while(i < a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }
    }
}
