package Lambda1;
@FunctionalInterface
interface MyLambda1{
    public void display();

}
class demo{
    public void method1(){
        MyLambda1 m = ()->{
            int count = 0;
            count++;
            System.out.println("hii");
            System.out.println("Priyanshu");
        };
        m.display();
    }
}
public class Lambda2 {
    public static void main(String[] args) {
        demo d = new demo();
        d.method1();
    }
}
