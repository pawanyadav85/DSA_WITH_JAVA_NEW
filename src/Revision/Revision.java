package Revision;
//
//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the x axis:");
//        int x = sc.nextInt();
//        System.out.print("Enter the y axis:");
//        int y = sc.nextInt();
//        if(x > 0 && y > 0){
//            System.out.println("1st quadrant");
//        }else if(x < 0  && y > 0){
//            System.out.println("2nd quadrant");
//        }else if (x < 0 && y < 0 ){
//            System.out.println("3rd quadrant");
//        }else if (x > 0 && y < 0){
//            System.out.println("4th quadrant");
//        }
//    }
//}



//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter the value of a :");
//        int a = sc.nextInt();
//        System.out.print("Enter the value of b :");
//        int b = sc.nextInt();
//        System.out.print("Enter the value of c :");
//        int c = sc.nextInt();
//        if(a <= b){
//            if(a <= c ){
//                System.out.println(a);
//            }else{
//                System.out.println(c);
//            }
//        }else{
//            if(b <= c){
//                System.out.println(b);
//            }else{
//                System.out.println(c);
//            }
//        }
//    }
//}


//
//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter the number:");
//        int n = sc.nextInt();
//        System.out.println(n % 2 == 0 ? "even " : "odd");
//    }
//}


//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n =  sc.nextInt();
//        boolean flag = false;
//        for (int i = 2; i < n; i++) {
//            if(n % i == 0 ){
//                flag = true ;
//                break;
//            }
//        }
//        if(flag ){
//            System.out.println("Composite number");
//        }else{
//            System.out.println("Not Composite number ");
//        }
//    }
//}

//
//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n =  sc.nextInt();
//        boolean flag = true;
//        for (int i = 2; i < n; i++) {
//            if(n % i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("Prime Number ");
//        }else{
//            System.out.println("Composite Number ");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n =  sc.nextInt();
//        for (int i = 1; i < n; i++) {
//            if(n % i == 0){
//                System.out.println(i);
//            }
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n =  sc.nextInt();
//        int i = 1;
//        while(i <= 100){
//            System.out.println(i);
//            i++;
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n =  sc.nextInt();
//        int count = 0;
//        while(n != 0){
//            n /= 10;
//            count++;
//        }
//        System.out.println(count);
//    }
//}


//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        int count = 0;
//        while(n != 0){
//            sum += n % 10;
//            n /= 10;
//            count ++;
//        }
//        System.out.println(sum);
//    }
//}


//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int  n = sc.nextInt();
//        int rev = 0;
//        while(n != 0){
//
//        }
//    }
//}


//
//import java.util.Scanner;
//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int  n = sc.nextInt();
//        int rev = 0;
//        while(n != 0){
//            rev *= 10;
//            rev += n % 10;
//            n /= 10;
//        }
//        System.out.println(rev);
//    }
//}



//import java.util.Scanner;
//
//public class Revision {
//    public static void MaxOfThree(int a  , int b , int c){
//        if(a >= b && a >= c){
//            System.out.println(a);
//        }else {
//            System.out.println(c);
//        } if(b >= c && b >= a){
//            System.out.println(b);
//
//   }else {
//            System.out.println(c);
//        }
//    }
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter the value of a ");
//        int  a = sc.nextInt();
//        System.out.println("Enter the value of b ");
//        int  b = sc.nextInt();
//        System.out.println("Enter the value of c ");
//        int  c = sc.nextInt();
//       MaxOfThree(a , b , c);
//    }
//}


//import java.util.Scanner;
//
//public class Revision {
//    public static void Name(){
//        Name1();
//        System.out.println("Pawan Yadav");
//    }
//    static void main(String[] args) {
//        Name3();
//    }
//    public static void Name1(){
//        System.out.println("Radha");
//    }
//    public static void Name3(){
//        Name1();
//        Name();
//        System.out.println("Roshni Yadav");
//        Name();
//    }
//}

//public class Revision {
//    static void main(String[] args) {
//        Name();
//    }
//    public static void Name(){
//        System.out.println("Pawan Yadav");
//        Name1();
//    }
//    public static void Name1(){
//        System.out.println("Radha");
//        Name();
//    }
//}

//import java.util.Scanner;
//
//public class Revision {
//    public static int Fact(int x ){
//        int f = 1 ;
//        for (int i = 1; i <= x; i++) {
//            f *= i;
//        }
//        return f;
//    }
//    static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int nPr = Fact(n) / Fact(n - r);
//        int nCr = Fact(n) / (Fact(r) * Fact(n - r));
//        System.out.println(nPr);
//        System.out.println(nCr);
//    }
//}

//import java.util.Scanner;
//
//public class Revision {
//    public static void change(int x){
//        x = 10;
//        System.out.println(x);
//    }
//    static void main(String[] args) {
//  int x = 8;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);
//    }
//}


/*
******************************************************************************************
******************************************************************************************
*******************************************************************************************
*/


//public class Revision {
//    static void main(String[] args) {
//        int [] arr = {2,3,4,5,6,7};
//        System.out.println(arr[3]);
//    }
//}


//
//public class Revision {
//    static void main(String[] args) {
//        int [] arr = {2,3,4,5,6,7};
//      arr[3] = 100;
//        System.out.println(arr[3]);
//    }
//}
//


//public class Revision {
//    static void main(String[] args) {
//        int [] arr = {2,3,4,5,6,7};
//        int n = arr.length;
//        System.out.println(n);
//    }
//}
//
//public class Revision {
//    static void main(String[] args) {
//        int [] arr = {2,3,4,5,6,7};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}



//
//public class Revision {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter The Length of Array:");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.print("Enter the Element :");
//        for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

//public class Revision {
//    static void main(String[] args) {
//        int [] arr = {4,-5,-3,-2,7,9};
//        int Max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > Max){
//                Max = arr[i];
//            }
//        }
//        System.out.println(Max);
//    }
//}
//
//public class Revision {
//    static void main(String[] args) {
//        int [] arr = {4,4,5,6,4,3};
//        int x [] = arr;
//        x[1] = 100;
//        System.out.println();
//    }
//}
//
//

//
//public class Revision {
//    static void main(String[] args) {
//        int [] arr = {4,4,5,6,4,3};
//      int [] x = Arrays.copyOf(arr,arr.length);
//        x [5] = 100;
//        System.out.println(arr[5]);
//        System.out.println(x[5]);
//    }
//}
//

//public class Revision {
//    static void main(String[] args) {
//        int[] arr = {4,5,6,8,9};
//        System.out.println(arr[3]);
//        change(arr);
//        System.out.println(arr[3]);
//    }
//    public static void change(int[] x){
//        x[3] = 100;
//    }
//}
//


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {4,5,6,7,3};
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
//
//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {3,4,5,6,7,2};
//        print(arr);
//        Arrays.sort(arr);
//        print(arr);
//    }
//    public static void print(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//}





//public class Revision{
//    static void main(String[] args) {
//   int[] arr = {3,4,5,67,2};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2 == 1){
//                arr[i] *= 2;
//            }else{
//                arr[i] += 10;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {3,4,5,6,7,8,2};
//        int target = 6;
//        int index = 1;
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target){
//                flag = true;
//                 index = i;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("Target exist at " + index );
//        }else {
//            System.out.println("Target does not exist ");
//        }
//    }
//}


//
//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {4,5,6,7,8,9};
//        int n = arr.length;
//        int target = 13;
//        int indexi = 1;
//        int indexj = 2;
//         boolean flag = false;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i] + arr[j] == target){
//                    flag = true;
//                  indexi = arr[i];
//                  indexj = arr[j];
//                    break;
//                }
//            }
//        }
//        if(flag){
//            System.out.println( indexi + indexj);
//        }
//    }
//}
//


//public class Revision {
//    static void main(String[] args) {
//        int[] arr = {3,4,5,1,6,78,};
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max1){
//                max1 = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max2  && arr[i] != max1) {
//                max2 = arr[i];
//            }
//        }
//        System.out.println(max2);
//    }
//}



//public class Revision {
//    static void main(String[] args) {
//        int[] arr = {2,4,5,6,7,1,4,3};
//        int n = arr.length;
//        int d = 4;
//        d = d % n;
//        revers(arr , 0 ,  d - 1);
//        revers(arr , d , n - 1);
//        revers(arr , 0 , n - 1);
//    for(int ele  : arr){
//        System.out.print(ele + " ");
//    }
//    }
//    public static void revers(int [] arr , int i , int j ){
//        while(i < j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
//}

//public class Revision {
//    static void main(String[] args) {
//    int[] arr = {1,3,4,5,6};
//    int n = arr.length + 1;
//    int Tsum = n * (n + 1) / 2;
//    int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//
//        }
//        System.out.println( Tsum - sum );
//    }
//}

//
//public class Revision {
//    static void main(String[] args) {
//        int[] arr = {0,1,0,1,1,0,0,1,1,1,0};
//        int n = arr.length;
//        int i = 0 , j = n - 1;
//        while(i < j){
//            if(arr[i] == 0){
//                i++;
//            }else if(arr[j] == 1){
//                j--;
//            }else{
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j--;
//            }
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}



//public class Revision {
//    static void main(String[] args) {
//     int[] arr = {1,2,3,4,5};
//     int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            if(i % 2 == 0){
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//                i++;
//            }
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}


//public class Revision {
//    static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(7);
//        arr.add(8);
// Collections.reverse(arr);
//        System.out.println(arr);
//    }
//}

//public class Revision {
//    static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6,7};
//        int[] b = {3,4,5,6,7,8,9,10};
//        int[] c = new int[a.length + b.length];
//        merge(a , b , c);
//        for (int ele : c){
//            System.out.print(ele + " ");
//        }
//    }
//
//    private static void merge(int[] a, int[] b, int[] c) {
//        int i = 0 ,  j = 0 ,  k = 0;
//        while(i < a.length && j < b.length){
//            if(a[i] < b[j]){
//                c[k] = a[i];
//                i++;
//                k++;
//            }else{
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }
//        while(i < a.length){
//            c[k] = a[i];
//            i++;
//            k++;
//        }while(j < b.length){
//            c[k] = b[j];
//            j++;
//            k++;
//        }
//    }
//}


//    public class Revision {
//        static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,7,8,1};
//        boolean flag = true;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if(arr[i] > arr[i + 1]) {
//                    flag = false;
//                    break;
//                }
//            }if(flag){
//                System.out.println("t");
//            }else{
//                System.out.println("f");
//            }
//        }
//    }

//public class Revision {
//    public static void print(int [] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//    static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,7,8,1};
//        print(arr);
//        int n = arr.length;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        print(arr);
//    }
//}

//public class Revision{
//    public static void print(int [] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//    static void main(String[] args) {
//        int[] arr = {2,3,4,5,2,6,1,7,8,9};
//        int n = arr.length;
//        for (int i = 0; i < n - 1 ; i++) {
//
//            boolean flag = true;
//            for (int j = 0; j < n - 1; j++) {
//                if(arr[j] > arr[j + 1]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag == true){
//                break;
//            }
//
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        print(arr);
//    }
//}


//public class Revision{
//    public static void print(int [] arr){
//        for(int ele : arr){
//            System.out.print(ele  + " ");
//        }
//    }
//    static void main(String[] args) {
//        int[] arr = {3,4,5,6,7,8,1,9};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//
//            int swap = 0;
//            for (int j = 0; j < n - 1 - i; j++) {
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swap ++;
//                }
//            }
//            if(swap == 0 ){
//                break;
//            }
//        }
//        print(arr);
//    }
//}

//
//public class Revision {
//    public static void print(int[] arr){
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }
//    static void main(String[] args) {
//        int[] arr = {3, 4, 5, 6, 7, 8};
//        int n = arr.length;
//        for (int i = 0 ; i < n - 1 ; i++){
//            int swap = 0;
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swap ++;
//                }
//            }
//            if(swap == 0){
//                break;
//            }
//        }
//        print(arr);
//    }
//}


//public class Revision{
//    public static void print(int[] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//    static void main(String[] args) {
//        int[] arr = {4,5,3,0,3,0,2,4,0};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if(arr[j] == 0){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        print(arr);
//    }
//}
//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {8,4,3,2,1,5,7,6};
//        int min = Integer.MAX_VALUE;
//            int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        for(int ele : arr){
//            System.out.println(ele);
//        }
//    }
//}
//

//public class Revision{
//    public static void print(int [] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//    static void main(String[] args) {
//        int[] arr = {4,3,2,1,5,6,7};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int min = Integer.MAX_VALUE;
//            int idx = -1;
//            for (int j = i; j < n ; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                    idx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = temp;
//        }
//        print(arr);
//    }
//}

//public class Revision{
//    public static void print(int [] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//    static void main(String[] args) {
//        int[] arr = {1,3,8,7,6,3,2};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int min = Integer.MAX_VALUE;
//             int idx = -1;
//            for (int j = i; j <  n ; j++) {
//                if(arr[j] < min){
//                    min = arr[j];
//                    idx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = temp;
//        }
//        print(arr);
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] a = {3,4,5,6,7};
//        int[] b = {4,5,9,8,7};
//        Arrays.sort(a);
//        Arrays.sort(b);
//        int[] c = new int[a.length + b.length];
//        int i = 0 , j = 0;
//        while(i < a.length && j < b.length){
//            if(a[i] == b [j]){
//                System.out.print(a[i] + " ");
//                i++;
//                j++;
//            }else if(a[i] > b[j]){
//                j++;
//            }else{
//                i++;
//            }
//        }
//    }
//}

//buble sort

//public class Revision{
//    static void main(String[] args) {
//      int[] arr = {7,3,4,7, 8 , 1};
//      int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int swap = 0;
//            for (int j = 0; j < n - 1 - i; j++) {
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swap ++;
//                }
//            }
//        if(swap == 0){
//            break;
//        }
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {7,3,4,7, 8 , 1};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int min = Integer.MAX_VALUE;
//            int idx = -1;
//            for (int j = i; j < n ; j++) {
//                if(arr[j] < min){
//                    min = arr[j];
//                    idx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = temp;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}


//public class Revision {
//    static void main(String[] args) {
//        int[][] arr = new int[3][4];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[][] arr = new int[3][5];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[][] arr = {{4,3,2,6,4} , {4,5,6,8,0} , {5,7,8,9,3}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//import java.util.Scanner;
//public class Revision{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the row : ");
//        int n = sc.nextInt();
//        System.out.print("Enter the coloum :" );
//        int m = sc.nextInt();
//        int [][] arr = new int[n][m];
//        System.out.print("Enter the matix element : ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr [i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[][] arr = {{1,2,3,4} , {5,6,7,8,9} , {5,4,3,2,1}};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println(sum);
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[][] arr = {{1,2,3,4} , {1,2,3,4} , {1,2,3,4}};
//        int product = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                product *= arr[i][j];
//            }
//        }
//        System.out.println(product);
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//      int[][] arr = {{1,2,3,4} , {1,2,10,4} , {1,2,3,9}};
//      int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if(arr[i][j] > max){
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println(max);
//    }
//}
//

//public class Revision{
//    static void main(String[] args) {
//        int[][] arr = {{1,2,3,4} , {3,4,51,6,7} , {9,8,7,7}};
//        int maxSum = Integer.MIN_VALUE;
//        int idx = -1;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arr[0].length; j++) {
//                sum += arr[i][j];
//            }if(sum > maxSum){
//                maxSum = sum;
//                idx = i;
//            }
//        }
//        System.out.println(maxSum + " " + idx);
//    }
//}

//import java.util.Scanner;
//public class Revision{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the Array:");
//                }else{
//                return false;
//        }
//    }
//    static void main(String[] args) {
//        int[] arr = {1,3,1};
//        System.out.println(FirstLast(arr));
//    }
//}    for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        if(arr[0] == 1 && arr[n - 1] == 1){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(4);
//        arr.add(8);
//        arr.add(9);
//        System.out.println(arr);
//        arr.remove(2);
//        System.out.println(arr);
//
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[][] arr = {{1,2,3,4} , {2,3,4,5} , {5,6,7,8} , {6,7,8,9}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        print(arr);
//    }
//
//    private static void print(int[][] arr) {
//        for(int[] a : arr){
//           for(int ele : a){
//               System.out.print(ele + " ");
//           }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}
//


//public class Revision{
//    static void main(String[] args) {
//        int[][] arr = {{1, 2, 3, 4}, {2, 3, 4, 5}, {5, 6, 7, 8}, {6, 7, 8, 9}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class Revision{
//    public static void print(int[] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//    static void main(String[] args) {
//        int[] arr = {1,2,3,5,1,3};
//        int n = arr.length;
//        for (int i = 0; i <  n - 1; i++) {
//            int swap = 0;
//            for (int j = 0; j <  n - 1; j++) {
//
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swap ++;
//                }
//            }
//            if(swap == 0) break;
//        }
//        print(arr);
//    }
//}


//import java.util.Arrays;
//
//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {1,0,4,0,6,0,4,3,0,6,0};
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != 0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//
//            }
//        }
//
//        for(int ele :arr)
//
//        System.out.print(ele +" ");
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {3,4,1,6,4,7,3};
//        int n = arr.length;
//        for (int i = 0; i < n - 1 ; i++) {
//            int min = Integer.MAX_VALUE;
//            int idx = 0;
//            for (int j = i; j < n ; j++) {
//                if(arr[j] < min){
//                    min = arr[j];
//                    idx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = temp;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//
//                int n = 5;
//                int m = 8;
//                for (int i = 1; i <= n; i++) {
//                    for (int j = 1 ; j <= i ;  j++) {
//
//                        System.out.print("*" + " ");
//                    }
//                    for (int j = i; j < n ; j++) {
//                        System.out.print("-");
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//            }
//        }

//public class Revision {
//    public static void main(String[] args) {
//        int n = 4;
//
//        // Upper half
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        // Lower half
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Revision{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        pawan(n);
//
//    }
//    public static void pawan(int n ){
//        if(n == 0){
//            return ;
//        }
//
//        pawan(n - 1);
//        System.out.println(n);
//    }
//}


//public class Revision {
//    static void main(String[] args) {
//        int[] arr = {4,3,2,7,5,3,1};
//        int n = arr.length;
//        for (int i = 0; i < n - 1 ; i++) {
//            int swap = 0;
//        for (int j = 0; j < n - 1 - i; j++) {
//            if(arr[j] > arr[j + 1]) {
//                int temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//                swap ++;
//            }
//
//            }
//if(swap == 0){
//    break;
//}
//            }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {4,3,2,7,5,1};
//        int n = arr.length;
//        for (int i = 0; i < n - 1 ; i++) {
//            int min = Integer.MAX_VALUE;
//            int idx = - 1;
//            for (int j = i; j <  n ; j++) {
//                if(arr[j] < min){
//                    min = arr[j];
//                    idx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = temp;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {6,5,4,3,2,1};
//        int n = arr.length;
//        for (int i = 1; i < n ; i++) {
//            int j = i;
//            while(j > 0  &&   arr[j] < arr[j - 1]){
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1]   = temp;
//                j--;
//            }
//        }
//for(int ele : arr){
//    System.out.print( ele + " ");
//}
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        String s1 ="Pawan Yadav";
//        String s2 = "Yadav";
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(1));
//        System.out.println(s1.substring(1,3));
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.contains("yadav"));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.replace('p','r'));
//        System.out.println(s1.equals(s1== s2));
//        System.out.println(s1.trim());
//        System.out.println(s1.equalsIgnoreCase(s2));
//
//
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        String s = "Kartik";
//        int half = s.length() / 2;
//        System.out.println(s.substring(0, half));
//    }
//}
//
//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {1,6,8,10,11,12,16,4,3,2};
//        int n = arr.length;
//        if(n== 0){
//            System.out.println(0);
//        }if(arr[0] > arr[1]){
//            System.out.println();
//        }if(arr[n-1] > arr[n-2]){
//            System.out.println(n - 1);
//        }
//
//        int lo = 0 , hi = n - 1;
//        while(lo <= hi){
//            int mid = (lo + hi )/ 2;
//            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
//                System.out.println(arr[mid]);
//                break;
//            } else if (arr[mid] > arr[mid - 1 ] && arr[mid] < arr[mid + 1]) {
//                lo = mid + 1;
//            }else {
//                hi = mid - 1;
//            }
//        }
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {1,3,4,5,7,6,5,4,3,2,2,1,};
//        int n = arr.length;
//        int lo = 0 , hi = n - 1;
//        while(lo <= hi){
//            int mid = (lo + hi) / 2;
//            if(arr[mid] > arr[mid + 1]){
//                hi = mid;
//            }else{
//                lo = mid + 1;
//            }
//        }
//        System.out.println(lo);
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {99,89,79,67,59,49,48,47};
//        int tar = 59;
//        int n = arr.length;
//        int lo = 0 , hi = n - 1;
//
//        boolean flag = false;
//        while(lo <= hi){
//            int mid = (lo + hi) / 2;
//            if(arr[mid] == tar){
//                System.out.println("Found at: " + mid);
//                flag = true;
//                break;
//            }else if(arr[mid] > tar){
//                lo = mid + 1;
//            }else{
//                hi = mid - 1;
//            }
//        }
//        if(!flag){
//            System.out.println("Not found ");
//        }
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {1,2,3};
//        for(int ele : arr){
//            System.out.println(ele);
//        }
//
//        int n = arr.length;
//        int i = 0 ,  j = n - 1;
//        while(i < j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        for(int ele  : arr){
//            System.out.println(ele );
//        }
//    }
//}

//public class Revision{
//    static void main(String[] args) {
//        int[] a = {1,3,4,5,6,7};
//        int[] b = {4,5,6,7};
//        int[] c = new int[a.length + b.length];
//        int i = 0, j = 0, k = 0;
//        while(i < a.length  && j < b.length ){
//            if(a[i] < b[j]){
//                c[k] = a[i];
//                i++;
//                k++;
//            }else{
//                c[k] = a[j];
//                j++;
//                k++;
//            }
//        }
//        while(i < a.length ){
//            c[k] = a[i];
//            i++;
//            k++;
//        }
//        while(j < b.length){
//            c[k] = b[j];
//            i++;
//            k++;
//        }
//        for(int ele : c){
//            System.out.print(ele + " ");
//        }
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {-4, 3, -9, 0, 4, 1};
//        double n = arr.length;
//                double positive_count = 0;
//                double Negative_count = 0;
//                double Zero_Count = 0;
//        for (int i = 0; i < n ; i++) {
//            if(arr[i] > 0){
//                positive_count ++;
//                System.out.println();
//            }else if(arr[i] < 0){
//                Negative_count ++;
//            }else{
//                Zero_Count ++;
//            }
//        }
//        System.out.println(positive_count / n);
//        System.out.println(Negative_count  / n);
//        System.out.println(Zero_Count  / n);
//    }
//}


//public class Revision{
//    static void main(String[] args) {
//        int[] arr = {1,3,4,2,2};
//                int n = arr.length;
//                int i = 0;
//                while(i < n){
//                    if(arr[i] == i + 1 || arr[i] == n){
//                        i++;
//                    }else{
//                        int idx = arr[i] - 1;
//                        if(arr[idx] != arr[i]) {
//                            swap(arr, i, idx);
//                        }else{
//                            System.out.println(idx + 1);
//                            break;
//                        }
//                    }
//                }
//            }
//            public static void swap(int[] arr , int i , int idx){
//             int temp = arr[i];
//             arr[i] = arr[idx];
//             arr[idx] = temp;
//            }
//        }
//

//public class Revision{
//    public static class student{
//        int age;
//        double cgpa ;
//        String name;
//         void print(student s){
//            System.out.println(s.name);
//        }
//    }
//    static void main(String[] args) {
//        student s = new student();
//        s.name = "Pawan Yadav";
//        s.cgpa = 7.74;
//        s.age = 20;
//
//        student s1 = new student();
//        s1.name = "yadav";
//        s1.cgpa = 7.74;
//        s1.age = 20;
//      s.print(s);
//      s1.print(s1);
//    }
//}44


public class Revision{
    static void main(String[] args) {
      int [] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
      int tar = 5;
      int n = arr.length;
      int lo = 0 , hi = n -1;
      int ans1 = - 1;
      while(lo <= hi) {
          int mid = (lo + hi) / 2;
          if (arr[mid] > tar) {
              hi = mid - 1;

          } else if (arr[mid] < tar) {
              lo = mid + 1;
          } else {
              ans1 = mid;
              hi = mid - 1;
          }
      }
        System.out.println(ans1);
         lo = 0 ;
        hi = n -1;
        int ans2 = - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > tar) {
                hi = mid - 1;

            } else if (arr[mid] < tar) {
                lo = mid + 1;
            } else {
                ans2 = mid;
                lo = mid + 1;
            }
        }
        System.out.println(ans2);
    }
}








