package Static_Final;
class  test{
    static  int x= 19;
    int y = 28;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println(x);
    }
}
public class static1 {
    public static void main(String[] args) {
        test t1 = new test();
        t1.show();
        t1.y = 123;
        t1.show();

    }
}
