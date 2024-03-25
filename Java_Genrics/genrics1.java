package Java_Genrics;

public class genrics1 <T>{
    T data[]= (T[]) new Object[6];

    public static void main(String[] args) throws Exception {
        try {


            genrics1<String> gd = new genrics1<>();
            gd.data[0] = "hii";
            gd.data[1] = "hi, Priyanshu";
            gd.data[2] = "hi, i'm Priyanshu";
            System.out.println(gd.data[0]);
        }catch (ClassCastException e){
            System.out.println(e);
        }



             //Object obj = new String("hello");
             //Object obj = new Integer(56);
             //String str = (String) obj;
             //System.out.println(str);
             //System.out.println(obj);
             // genric type array

    }


}

