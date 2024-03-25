             // program for if elif statement
package company;

import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        int marks;
        System.out.println("enter mark :");
        Scanner value = new Scanner(System.in);
        marks= value.nextInt();
        if (marks>80)
        {
            System.out.println("topper");
        } else if (marks<80&&marks>=60)
        {
            System.out.println(" b grade");
        }
        else {
            System.out.println("fail");
        }
        int year=2002;
        if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
            System.out.println("it is leap year");
        }
        else {
            System.out.println("common year");}


    }
}
