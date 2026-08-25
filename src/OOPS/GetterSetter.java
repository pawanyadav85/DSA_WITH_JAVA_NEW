package OOPS;

public class GetterSetter {
    public static class Student{
        String name;
        private int roll;
        char sec;


        void print(){        // getter
            System.out.println(name + " " + roll +" "+sec);


        }
        int getrol(){      // Getter
            return roll;
        }
        void setRoll(int x){     // Setter
            roll = x;
        }

    }
    static void main(String[] args) {
        Student s = new Student();
        s.name = "Pawan Yadav";
        s.roll = 117;
        s.sec = 'B';


        s.print();
        s.setRoll(45);
        System.out.println(s.getrol());
    }
}
