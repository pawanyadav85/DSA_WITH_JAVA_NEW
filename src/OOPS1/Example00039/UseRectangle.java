package OOPS1.Example00039;

class Rectangle{
    int length;
    int breath;

    public int premeter(){
        return 2 * (length + breath);
    }
    public int area(){
        return length * breath;
    }
}
public class UseRectangle {
    static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5;
        r.breath = 8;
        System.out.println("Premeter of rectangle "+r.premeter());
        System.out.println("Area of rectangle "+r.area());
    }
}
