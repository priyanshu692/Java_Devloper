package Abstract_class;

public class AbstractClass1 {
    public static void main(String[] args) {
        super1 s =new sub();
        s.meth1();
    }
}
abstract class super1{
    public super1(){
        System.out.println("super constructor");
    }
    public void meth1(){
        System.out.println("meth1 of super claas");
    }
    abstract public void meth2();

}
class sub extends super1{
    @Override
    public void meth2() {

    }
}
