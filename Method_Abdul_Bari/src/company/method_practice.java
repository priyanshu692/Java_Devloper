package company;

public class method_practice {
   public static int max(int x, int y){
        if(x>y)
            return x;

        else
           return y;


    }

    public static void main(String[] args) {
       int x = 78, y= 98;
       //method_practice mp = new method_practice();
        System.out.println(method_practice.max(x,y));
    }
}
