package company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int x;
        System.out.println("enter your number:");
        Scanner num=new Scanner(System.in);
        x=num.nextInt();
        if (x%2==0){
            System.out.println("number is even");

        }
        else {
            System.out.println("number is odd");
        }
    }
}
