package company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        String num;
        System.out.println("enter a number:");
        num= value.nextLine();
        if (num.matches("[01]+"))
            System.out.println("binary radix=2");
        else if (num.matches("[0-7]+")) {
            System.out.println("octal radix=8");
        }
        else if (num.matches("[0-9A-F]+")) {
            System.out.println("hexadecimal value");
        }
        else if (num.matches("[0-9]+")) {
            System.out.println("decimal number");
        }
        else   {
            System.out.println("invelide number");
        }
    }
}
