package company;

import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        int Arr[]={8,98,81,56,12,14,55,18};
        int key;
        System.out.println("key : ");
        Scanner scr = new Scanner(System.in);
        key= scr.nextInt();
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]== key) {
                System.out.println(" Element found at : "+i);
                System.exit(0);
            }


        }
        System.out.println("not found Element");

    }
}
