package company;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        System.out.println("enter day no.:");
        Scanner value=new Scanner(System.in);
        int day = value.nextInt();
        if (day==1){
            System.out.println("it is monday");
        }
        else if ((day==2)) {
            System.out.println("it is teuseday");

        }
        else if ((day==3)) {
            System.out.println("it is wenesday");

        }
        else if ((day==4)) {
            System.out.println("it is thursday");

        }
        else if ((day==5)) {
            System.out.println("it is friday");

        }
        else if ((day==6)) {
            System.out.println("it is saturday");

        }
        else if ((day==0)) {
            System.out.println("it is sunday");

        }
    }
}
