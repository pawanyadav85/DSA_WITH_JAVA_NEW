package OOPS;

class ComplexNo {
    int x;
    int y;

    ComplexNo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void print() {
        if(y>= 0){
        System.out.println(x + " - " +y +"i");
        }else{
            System.out.println(x + "  " +(- y) +"i");
        }
    }
}
public class ComplexNumberClass {

    static void main(String[] args) {
        ComplexNo z1 = new ComplexNo(2,5);
        ComplexNo z2 = new ComplexNo(3,9);
        z1.print();
        z2.print();
    }
}
