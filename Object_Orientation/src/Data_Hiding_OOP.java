public class Data_Hiding_OOP {
    public static void main(String[] args) {
        rectangle1 r1 = new rectangle1();
        r1.setLength(10);
        r1.setLength(115);

        System.out.println("area: "+r1.area());
        System.out.println("perimeter: "+r1.perimeter());
    }

}

class rectangle1 {
    private int length;
    private int breath;

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public  double area(){
        return (length*breath);

    }

    public double perimeter(){
        return 2*(length+breath);
    }
}
