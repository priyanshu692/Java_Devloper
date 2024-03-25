package company;

public class Student_chellange {
    static  boolean isPrime(int n){
        for(int i= 2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    // creating a method for GCD
    static int GCD(int x, int y){
        while (x!=y){
            if (x>y)x= x-y;
            else y= y-x;
        }
        return x;
    }

    public static void main(String[] args) {
        if (isPrime(45))
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not prime");

        //
        Student_chellange x = new Student_chellange();
        //int gcd = GCD(23,45);
        System.out.println(x.GCD(32,56));
    }
}
