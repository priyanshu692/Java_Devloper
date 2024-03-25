package Interface;

public class Interface1 {
    public static void main(String[] args) {
        paper p1 = new paper();
        p1.meth1();
        p1.meth2();
    }
}
interface test{
    void meth1();
    void meth2();
}
class paper implements test{
    public void meth1(){
        System.out.println("meth1 of class paper");
    }
    public void meth2(){
        System.out.println("meth2 of class paper");
    }
}