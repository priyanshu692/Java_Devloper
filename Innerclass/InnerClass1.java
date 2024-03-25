package Innerclass;

public class InnerClass1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerdisplay();

        Outer.inner oi = new Outer().new inner();

    }
}
class Outer{
    int x=10;
    class inner{
        int y = 13;
        public void multiply(){
            System.out.println("multiply is: "+x*y);

        }
    }
    public void outerdisplay(){
        inner i = new inner();
        i.multiply();
    }
}
