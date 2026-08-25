package Strings;

public class sliptInString {
    static void main(String[] args) {
        String s = "Banana , Apple , Orange";
        String[] arr = s.split(",");
        for(String ele : arr){
            System.out.println(ele);
        }
    }
}
