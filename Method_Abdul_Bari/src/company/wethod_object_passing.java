package company;

import java.util.Arrays;

public class wethod_object_passing {
    static void change(int x[], int index, int value){
        x[index] = value;
    }

    // this method is use for Number in Prime or not
    static  boolean isPrime(int n){
        for(int i= 2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {10,12,74,32};
        change(a,3,37);
        System.out.println(Arrays.toString(a));

        // that method is call for check number is Prime
        if (isPrime(91))
            System.out.println("91 is Prime");
    }
}
