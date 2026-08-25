package Strings;

public class StringBulderReverse {
    static void main(String[] args) {
        String s = "Pawan";
        StringBuilder ch = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ch.append(s.charAt(i));
        }
        System.out.println(ch);
    }
}
