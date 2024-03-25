package company;

public class Array_3 {
    public static void main(String[] args) {
        int A[]=new int [10];
        int Array[]={5,3,9,5,6,8,9};
        int C[]=new int[10];
        Array[2]=56;
        //for(int i=0;i<A.length;i++) {
           // System.out.println(Array[i]);

        //}
        for (int x:Array
             ) {
            System.out.println(x++);
            
        }

    }
}
