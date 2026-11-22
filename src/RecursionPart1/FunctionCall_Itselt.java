package RecursionPart1;

public class FunctionCall_Itselt {
    static void main(String[] args) {
pawan(1);
    }
    public static void pawan( int n ){
        if(n == 5) {
            return;
        }
            System.out.println("Radhe Radhe");
            pawan(n + 1);
    }
}
