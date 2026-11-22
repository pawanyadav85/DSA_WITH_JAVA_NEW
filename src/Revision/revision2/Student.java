package Revision.revision2;

public class Student {
   private int id;
    private  String name;
    Student(){
        id = 102;
    }
    Student(  int id , String name ){
        this.name = name;
        this.id = id;
    }
    public void setName(String name ){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    void dispaly(){
        System.out.println("id of student : " + id);
        System.out.println("Name of student " + name);
    }
}
