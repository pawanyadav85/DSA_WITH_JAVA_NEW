package RevisionPart2;
import java.util.ArrayList;
public class StringChangeByFunction {
    static void main(String[] args) {
        ArrayList<String> ans = new  ArrayList<>();
        ans.add("Pawan");
        ans.add("Yadav");
        ans.add("Radha");
        System.out.println(ans);
        change(ans);
        System.out.println(ans);
    }
    public static void change(ArrayList<String> ans){
        ans.add("Ram");

    }
}
