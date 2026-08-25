package if_else;

import java.util.Scanner;

public class Ractangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth :");
        int breadth = sc.nextInt();
        System.out.print("Enter the Length");
        int length = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 *( length + breadth);
        if(area > perimeter ){
            System.out.println("Area is Greater");
        }else{
            System.out.println("Area is not Greater");
        }
    }
}
