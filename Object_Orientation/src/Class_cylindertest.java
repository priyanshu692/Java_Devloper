public class Class_cylindertest {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.redius = 18;
        c1.height = 12;
        System.out.println("lid Area: "+c1.lidarea());
        System.out.println("circumfence Area: "+c1.circumfence());
        System.out.println("total surface  Area: "+c1.totalSurfaceArea());
        System.out.println("volume: "+c1.volume());


    }
}
/*
class cylinder{
    public double redius;
    public double height;

    public double lidarea(){
        return Math.PI*redius*redius;
    }
    public double totalSurfaceArea(){
        return 2*lidarea()+circumfence()*height;
    }

    public double circumfence(){
        return 2*Math.PI*redius;
    }

    public double volume(){
        return lidarea()*height;
    }
}

 */