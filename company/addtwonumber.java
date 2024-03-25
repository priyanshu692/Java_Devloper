package company;

import java.util.Scanner;

public class addtwonumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+b);
        int c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter value:");
        c=obj.nextInt();
        System.out.println(c);
        
        int d;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter value:");
        d=ob.nextInt();
        System.out.println(d);
        System.out.println(c+" "+d);
    }
}
