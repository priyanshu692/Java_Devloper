package company;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("enter a month:");
        Scanner value=new Scanner(System.in);
        int A=value.nextInt();


        switch ( A) {
            case 1:
                System.out.print("jan");
                break;
            case 2:
                System.out.print("fab");
                break;
            case 3:
                System.out.print("mar");
                break;
            case 4:
                System.out.print("apr");
                break;
            case 5:
                System.out.print("may");
                break;
            case 6:
                System.out.print("jun");
                break;
            case 7:
                System.out.print("jul");
                break;
            case 8:
                System.out.print("aug");
                break;
            case 9:
                System.out.print("sep");
                break;
            case 10:
                System.out.print("oct");
                break;
            case 11:
                System.out.print("nov");
                break;
            case 12:
                System.out.print("dec");
                break;
            default:
                System.out.print("invalid operator ");
        }
    }
}
