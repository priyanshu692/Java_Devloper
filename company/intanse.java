package company;



public class intanse {
    int a = 10;//instance variable
    static int b=20;//static variable

    public static void main(String[] args) {
        int c= 30;//local variable
        final int d = 40;//final variable
        //company.instanse ref=new intanse();
       // System.out.println(ref.a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
