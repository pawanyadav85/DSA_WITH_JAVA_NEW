package RevisionPart2;

public class TowerOfHanoi {
    static void main(String[] args) {
        Hanoi(3, 'A' , 'B' , 'C');

    }
    public static void Hanoi(int n , char A , char B , char C){
        if(n == 0){
            return ;
        }
        // Moving A to B via C
        Hanoi(n - 1 , A , C , B);
        // Moving A to C
        System.out.println(A + "->" + C);
        // Moving B to C via A
        Hanoi(n - 1 , B , A, C);
    }
}
