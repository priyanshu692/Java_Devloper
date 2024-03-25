package java_doc;
@interface MyAnno{
    String name();
    //String date();

} @MyAnno(name = "Priyanshu")
public class Annotation {
    public static void main(String[] args) {
        @MyAnno(name= "Priyanshu")
                int data;


    }
}
