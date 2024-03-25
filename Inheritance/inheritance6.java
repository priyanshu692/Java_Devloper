package Inheritance;

public class inheritance6 {
    public static void main(String[] args) {
        sup_ovrriding so = new sup_ovrriding();
        so.display();

        sub s = new sub();
        s.display();
    }
}
class sub{
    public  void display(){
        System.out.println("super class display");
    }

}
class sup_ovrriding extends sub{
    @Override
    public void display(){
        System.out.println("sub class display");
    }

}
