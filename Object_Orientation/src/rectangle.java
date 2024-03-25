public class rectangle {
    public double length;
    public double breath;

    // area of rectangle
    public double area(){
        return length*breath;
    }

    public double perimeter(){
        return 2*(breath+length);
    }
    public boolean isSquare(){
        if (length==breath)
            return true;
        else
            return false;
    }

}
