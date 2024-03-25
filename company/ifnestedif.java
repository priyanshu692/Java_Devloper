        //* program for nested if statement
           //program how to find gretest value in three user input
package company;

import java.util.Scanner;

public class ifnestedif {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.print("enter your number1 :");
        Scanner A=new Scanner(System.in);
        a= A.nextInt();
        System.out.print("enter your number2 :");
        Scanner B=new Scanner(System.in);
        b= B.nextInt();
        System.out.print("enter your number3 :");
        Scanner C=new Scanner(System.in);
        c= C.nextInt();
        if ((a>b)){
            if (a>c){
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if (b>c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
