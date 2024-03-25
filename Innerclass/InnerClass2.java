package Innerclass;

public class InnerClass2 {
    public static void main(String[] args) {
        outer o = new outer();
        o.display();


    }
}
class outer{
    public void display(){
        class inner{
            public void show(){
                System.out.println("hello");
            }
        }
        new inner().show();

    }
}