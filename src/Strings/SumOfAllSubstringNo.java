package Strings;

public class SumOfAllSubstringNo {
    static void main(String[] args) {
        String s = "6759";
        //Output: 8421
        int  sum = 0 ;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i , j);
                sum += Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
