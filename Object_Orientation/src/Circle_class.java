public class Circle_class {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle.redius = 8;

        circle c2 = new circle();
        circle.redius = 15;

        System.out.println(c1.area());

        System.out.println(circle.perameter());

        System.out.println(c1.circumfrance());

        System.out.println(c2.area());

        System.out.println(circle.perameter());

        System.out.println(c2.circumfrance());

    }
}
class circle{
    public static double redius;
    public double area(){
        return Math.PI*redius*redius;
    }
    public static double perameter(){
        return  2*Math.PI*redius;
    }
    public  double circumfrance(){
        return perameter();
    }

}
