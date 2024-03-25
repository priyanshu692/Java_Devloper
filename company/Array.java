package company;

import java.util.Scanner;

public class Array {
   /* public static void main(String[] args) {
        int Arr[]={8,98,81,56,12,14,55,18};
        int Max=Arr[0];

        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>Max){
                Max=Arr[i];
            }

        }
        System.out.println(Max);
    }
*/
   public static void main(String[] args) {
       int Arr[]={8,98,81,56,12,14,55,18};
       int Max_1 , max_2;
       max_2=Max_1= Arr[0];
       for(int i=0;i<Arr.length;i++){
           if(Arr[i]>Max_1){
               max_2=Max_1;
               Max_1=Arr[i];

           }
           else if (Arr[i]>max_2) {
                max_2=Arr[i];
           }
       }
       System.out.println("second lergest element is: "+max_2);
   }

}



