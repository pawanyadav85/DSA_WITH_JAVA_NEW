package OOPS1.Example0039;
class Square{
    int side;
    public int rectangle(){
        return 4 * side;
    }
    public int area(){
        return side * side;
    }
}
public class UseSquare {
    static void main(String[] args) {
        Square s = new Square();
        s.side = 3;
        System.out.println(s.rectangle());
        System.out.println(s.area());
    }
}
