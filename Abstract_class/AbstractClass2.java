package Abstract_class;

public class AbstractClass2 {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.length = 10;
        rec.breath = 12;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

    }
}
abstract class  shape{
    abstract public double perimeter();
    abstract public double area();

}
class  circle extends shape{
    double radius;

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

class rectangle extends shape{
    double length;
    double breath;

    public double perimeter(){
        return 2* (length+breath);
    }
    @Override
    public double area(){
        return length*breath;
    }
}
