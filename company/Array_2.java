package company;

import java.util.Scanner;

// dynamic array or user define array
public class Array_2 {
             public static void main(String[] args) {
                 int size,i;
                 Scanner value=new Scanner(System.in);
                 System.out.println("enter size of Array :");
                 size= value.nextInt();
                 int a[]=new int [size];
                 for(i=0;i<size;i++){
                     a[i]= value.nextInt();
                 }
                 System.out.println("printed array element ");
                 for(i=0;i<size;i++){
                     System.out.println(a[i]+" ");
                 }
             }
}
