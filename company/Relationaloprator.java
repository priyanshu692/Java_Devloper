package company;

import java.util.Scanner;

public class Relationaloprator {
    public static void main(String[] args) {
        int a; int b;
        System.out.println("enter first number:");
        Scanner object=new Scanner(System.in);
        a=object.nextInt();
        System.out.println("enter first number:");
        Scanner obj=new Scanner(System.in);
        b=obj.nextInt();
        System.out.println("true/false:"+(a>b));
        System.out.println("true/false:"+(a<b));
        System.out.println("true/false:"+( a == b ));
        System.out.println("true/false:"+(a >= b));
        System.out.println("true/false:"+(a<=b));
        System.out.println("true/false:"+(a!=b));
    }
}
