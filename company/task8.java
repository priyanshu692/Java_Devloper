package company;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.print("enter domain name:");

        Scanner value =new Scanner(System.in);
        String domain=value.next();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        switch (ext){
            case "com":
                System.out.println("commercial");
                break;
            case "gov":
                System.out.println("government");
                break;
            case "in":
                System.out.println("indian website");
                break;
            case "org":
                System.out.println("organizational");
                break;
            case "edu":
                System.out.println("educational");
                break;
            default:
                System.out.println("invalid web site");


        }
    }
}
