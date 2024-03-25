        // program for simple if  statement
package company;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class simpleif {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age...! :");
        Scanner value =new Scanner(System.in);
        age=value.nextInt();
        if(age>=18){
            System.out.println("you are eligible for voting");
        }
        System.out.println("thank you");
    }
}
