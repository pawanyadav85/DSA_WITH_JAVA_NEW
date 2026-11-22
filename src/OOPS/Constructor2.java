package OOPS;

public class Constructor2 {
    public static class StudentData{
        String name;
        int roll ;
        int[] marks;

        StudentData(int[] s1){
            marks = s1;
        }
        StudentData(int s1){
            marks = new int[s1];
        }
    }
    static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        StudentData s1 = new StudentData(arr);

        System.out.println(arr[0]);
    }
}
