package company;

import java.util.Scanner;

public class Calculate_area_of_triangle {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);

        int a,b,c;
        float s;
        double area;
        System.out.println("Enter a dimension of triangle a: ");
        System.out.println("Enter a dimension of triangle b: ");
        System.out.println("Enter a dimension of triangle c: ");
        a = value.nextInt();
        b = value.nextInt();
        c = value.nextInt();
        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+area);




    }
}
