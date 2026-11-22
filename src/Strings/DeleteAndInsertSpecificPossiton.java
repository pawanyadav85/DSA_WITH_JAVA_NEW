package Strings;

public class DeleteAndInsertSpecificPossiton {
    static void main(String[] args) {
        String s = "Pawan yadav";
        StringBuilder t = new StringBuilder(s);

        t.insert(1,'v');

        System.out.println(t);

        t.deleteCharAt(2);
        System.out.println(t);
    }
}
