package Inheritance;

public class Inheritance2 {
    public static void main(String[] args) {
        grandchild c = new grandchild();
    }
}
class parents{
    public  parents(){
        System.out.println("parent constructor");

    }
}
class child extends parents{
    public child(){
        System.out.println("child constructor");
    }
}
class grandchild extends child{
    public grandchild(){
        System.out.println("grandchild constructor");
    }
}