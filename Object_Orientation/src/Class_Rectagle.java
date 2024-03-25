// import rectangle;
public class Class_Rectagle {
    public static void main(String[] args) {
        rectanglebox r = new rectanglebox();
        r.length = 12;
        r.breath=15;

        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println("is it a square: "+r.isSquare());

    }
}


