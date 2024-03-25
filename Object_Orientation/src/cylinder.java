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