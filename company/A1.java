package company;

public class A1 {
   static int a=10;
   void fun(){
       int c =20;
       System.out.println(a+" "+c);
       ++a; ++c;
   }

    public static void main(String[] args) {
        A1 ref= new A1();
        ref.fun();
        ref.fun();

    }

}
