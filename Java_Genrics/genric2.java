package Java_Genrics;
class Data<T>{
    private T obj;
    public  void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }

}
public class genric2 {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());
        Data<String> d1 = new Data<>();
        d1.setData("Priyanshu");
        System.out.println(d1.getData());

    }
}