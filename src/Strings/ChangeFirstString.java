package Strings;

public class ChangeFirstString {
    static void main(String[] args) {
        String s = "pawaN";
        char ch = s.charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(s.toUpperCase());
        }else{
            System.out.println(s.toLowerCase());
        }
    }
}
