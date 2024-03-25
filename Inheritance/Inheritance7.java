package Inheritance;

public class Inheritance7 {
    public static void main(String[] args) {
        tv tv1 = new tv();
        tv1.switchon();
        tv1.changechennal();

        smarttv st = new smarttv();
        st.browser();
        st.switchon();
        st.changechennal();

        tv t= new smarttv();
        t.changechennal();
    }
}
class tv{
    public void switchon(){
        System.out.println("tv is switch on");
    }
    public void changechennal(){
        System.out.println("tv channel change ");
    }
}
class smarttv extends tv{
    @Override
    public void switchon(){
        System.out.println("smart tv is switch on");
    }
    @Override
    public void changechennal(){
        System.out.println("smart tv channel change");
    }
    public void browser(){
        System.out.println(" smart tv browsing");
    }

}
