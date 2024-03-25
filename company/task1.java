           // find person is young or not young
package company;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age :");
        Scanner Age=new Scanner(System.in);
        age=Age.nextInt();
        if (age>=18 && age<=60){
            System.out.print(" you are young");
        }
        else {
            System.out.println("you are not young");
        }
    }
}
