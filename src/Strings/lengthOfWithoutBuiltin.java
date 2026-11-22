package Strings;

public class lengthOfWithoutBuiltin {
    static void main(String[] args) {
        String s = "Pawan";
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count ++;
        }
        System.out.println(count);
    }
}
