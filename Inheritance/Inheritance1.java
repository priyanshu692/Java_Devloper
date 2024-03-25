package Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.radious=5;
        c1.height= 8;

        System.out.println("volume "+c1.volume());
        System.out.println("area "+c1.area());
    }
}
class  circle{
    public double radious;
    public double area(){
        return Math.PI*radious;
    }
    public double perimeter(){
        return 2*Math.PI*radious;
    }
}
class  cylinder extends  circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}