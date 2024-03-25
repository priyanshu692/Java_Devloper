package Inheritance;

public class Inheritance5 {
    public static void main(String[] args) {
        cuboid c1= new cuboid(12,23,9);
        c1.disply();
    }
}
class  rectangle_super{
    int length;
    int breath;
    int x= 10;
    rectangle_super(int length,int breath){
        this.length= length;
        this.breath= breath;
    }
}
class cuboid extends rectangle_super{
    int height;
    int x =30;

    cuboid (int l,int b,int h)
    {
      super(l,b);
      height=h;
    }
    void disply(){
        System.out.println(super.x);
        System.out.println(x);
    }
}