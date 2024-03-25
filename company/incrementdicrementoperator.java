package company;

public class incrementdicrementoperator {
    public static void main(String[] args) {
        int a=10;
        a++;
        //--a;
        //ystem.out.println(a);
        System.out.println("pre/post increment");
        System.out.println((++a));
        System.out.println(( a ++));//problom
        System.out.println("pre/post decrement");
        System.out.println((--a));
        System.out.println((a--));
    }
}

