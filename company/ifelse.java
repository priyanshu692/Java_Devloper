         // program for if else statement
package company;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number :");
        Scanner value=new Scanner(System.in);
        n= value.nextInt();
        if (n>=0)
        {
            System.out.println(" positive value");
        }
        else {
            System.out.println("negative value");
        }
        int year;
        System.out.println("enter year :");
        Scanner Year=new Scanner(System.in);
        year= Year.nextInt();

        if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
            System.out.println("it is leap year");
        }
        else {
            System.out.println("common year");
        }

    }
}
