package company;

import java.util.Scanner;

public class Arithmeticoperator {
    public static void main(String[] args) {
        int a; int b;
        System.out.println("enter first number:");
        Scanner object=new Scanner(System.in);
        a = object.nextInt();
        System.out.println("enter second number:");
        Scanner obj=new Scanner(System.in);
        b = obj.nextInt();
        System.out.println("addition:"+ (a+b));
        System.out.println("subtraction:"+  (a-b));
        System.out.println("multiplication:"+ a*b);
        System.out.println("divison:"+ a/b);
        System.out.println("modulo:"+ a%b);



    }
}
