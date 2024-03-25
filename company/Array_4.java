package company;

public class Array_4 {
    public static void main(String[] args) {
        /*{
            int Arr[] = { 5,6,9,15,49,55,24,1,4};
            int sum=0;
            for (int i=0;i<Arr.length;i++)
            {
                sum=sum+Arr[i];
            }
            System.out.println("sum is "+ sum);
        }
    }
    */
        int arr[]={3,2,4};
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==6){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
