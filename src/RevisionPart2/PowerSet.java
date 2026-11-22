package RevisionPart2;

import java.util.ArrayList;

public class PowerSet {
    static void main(String[] args) {
        ArrayList<String> list = new  ArrayList<>();
        String str = "Pawan";

        change(" " , str ,0 , list);
        System.out.println(list);
    }
    public static void change(String ans , String str , int idx , ArrayList<String> list){
        if(idx == str.length()){
            if(ans.length() != 0)
            list.add(ans);
           // System.out.print(ans +" ");
            return;
        }

        char ch = str.charAt(idx);
        change(ans + ch , str, idx + 1 ,list);
        change(ans, str, idx + 1 ,list);
    }
}
