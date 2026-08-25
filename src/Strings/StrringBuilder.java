package Strings;

public class StrringBuilder {
    static void main(String[] args) {
        StringBuilder s = new StringBuilder("Pawan");

        System.out.println(s);
        s.append(" Yadav");
        System.out.println(s);

        System.out.println(s + " " +   s.capacity());
        s.setCharAt(0,'R');
        System.out.println(s);
    }
}
