package Static_Final;
class test3 {
    public final void show() {
        System.out.println("hello");
    }
}



public class Final1 {
    public static void main(String[] args) {
        final float PI = 3.14f; // Assign a value to the final variable PI
        System.out.println(PI);

        test3 t = new test3();
        t.show();

    }
}
