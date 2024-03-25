public class Constructor {
    public static void main(String[] args) {
        ract r1= new ract();
        ract  r2 = new ract(15,42);
    }
}
class ract{
    private double length;
    private double breath;
    // non parameterized constructor
    public ract(){
        length=1;
        breath=1;
    }

    // parameterized constructor

    public ract(double l, double b){
        length= l;
        breath= b;
    }
    public ract(double s){
        length=breath=s;
    }
}
