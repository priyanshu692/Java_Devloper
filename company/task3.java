package company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int x;
        System.out.println("enter two digit number :");
        Scanner num=new Scanner(System.in);
        x= num.nextInt();
        if(x>=90){
            System.out.println("grade:A");
        }
        else if (x<90 && x>=80) {
            System.out.println("grade:B");


        }
        else if (x<80 && x>=70) {
            System.out.println("grade:C");

        }
        else if (x<70 && x>=60) {
            System.out.println("grade:D");
        }
        else if (x<60 && x>=50) {
            System.out.println("grade:e");
        }
        else if (x<50 && x>=33) {
            System.out.println("grade:f");
        }
        else{
            System.out.println("fail");
        }
    }
}
