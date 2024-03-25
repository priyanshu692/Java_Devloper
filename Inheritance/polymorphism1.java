package Inheritance;

public class polymorphism1 {
    public static void main(String[] args) {
        sup1 s = new sub1();
        s.meth2();

        sub1 s1= new sub1();
        s.meth1();
    }
}
class sup1{
    public void meth1(){
        System.out.println(" super meth1");
    }
    public void meth2(){
        System.out.println(" super meth2");
    }
}
class sub1 extends sup1{
    @Override
    public void meth2(){
        System.out.println(" sub meth2");
    }
    public void meth3(){
        System.out.println(" sub meth3");
    }
}
