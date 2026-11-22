package Strings;

public class ReverseOfString {
    static void main(String[] args) {
        String s = "Pawan";
        int n = s.length();
        char[] ch = s.toCharArray();
        for (int i = n - 1; i >= 0 ; i--) {
            System.out.print(ch[i]);
        }
    }
}
