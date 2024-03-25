package company;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {


        Scanner value=new Scanner(System.in);
        System.out.println("enter a url:");
        String url =value.next();
        String protocol=url.substring(0,url.indexOf(":"));
        if (protocol.equals("http")){
            System.out.println("hyper text transfer protocol");
        }
        else if (protocol.equals("ftp")) {
            System.out.println("file transfer protocol");
        }
        String ext=url.substring(url.lastIndexOf(".")+1);
        if (ext.equals("com")){
            System.out.println("commercial");
        }
        if (ext.equals("org")){
            System.out.println("orgnization");
        }
        if (ext.equals("gov")){
            System.out.println("government ");
        }

    }
}
