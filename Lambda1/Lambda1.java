package Lambda1;
@FunctionalInterface
interface MyLambda{
    //public void display(String str);
    int add(int x,int y);
}
/*class  my implements MyLambda{
    public void display(){
        System.out.println("hello world");
    }
}*/
public class Lambda1 {
    public static void main(String[] args) {
        // Anonymous method
        /*MyLambda m = (str)->{
            System.out.println(str);
        };
        m.display("java programming");*/
        MyLambda m1 = (x,y)->{
            return (x+y);
        };
        int sum = m1.add(10,65);
        System.out.println(sum);

    }
}
