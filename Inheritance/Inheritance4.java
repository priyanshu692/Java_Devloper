package Inheritance;

public class Inheritance4 {
    public static void main(String[] args) {
        rectangle_this r1 = new rectangle_this(10,20);
    }
}
class rectangle_this{
    int length;
    int breath;

    rectangle_this(int length, int breath){
        this.length= length;
        this.breath= breath;
    }
    void display(){
        System.out.println("length: "+this.length);
        System.out.println("breath: "+ this.breath);
    }
}
