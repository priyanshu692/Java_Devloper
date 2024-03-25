package company;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
       /* int A[] = {10,20,65,52,30,40,};//dynamic array
        System.out.println(A[3]);*/
       /* int A[]=new int[10];//static array
        A[0]=10;
        A[1]=15;
        A[2]=18;
        A[3]=11;
        A[4]=13;
        A[5]=14;
        for(int i=0;i<6;i++)
        {
            System.out.println(A[i]);
        }*/
        int size,i;
        Scanner value=new Scanner(System.in);
        System.out.println("enter size of Array ");
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
