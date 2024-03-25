package company;

public class Method_Overloading {
    int max(int x, int y){
     return x>y?x:y;
    }
    float max (float x, float y){
        if (x>y)
            return x;
        else
            return y;

    }
    int max (int x, int y, int z){
        if (x>y && y>z)
                return x;
            else if (y>z)
                return y;
            else
                return z;
    }

    public static void main(String[] args) {
        Method_Overloading MO= new Method_Overloading();
        System.out.println(MO.max(10,56));
        System.out.println(MO.max(12,15,9));
        System.out.println(MO.max(12f,15.1f));
    }
}
