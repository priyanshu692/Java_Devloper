package MultiThreading;

public class MultiThreading1 {
    public static void main(String[] args) {
        threads1 t1 = new threads1();
        t1.start();
        threads ta = new threads();
        ta.run();

        int i = 1;
        while (i >= 10) { // Print "hello" ten times
            System.out.println(i + "hello");
            i++;
        }
    }
}

class threads implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i > 0) { // Print "hello" ten times
            System.out.println(i + "world");
            i++;
        }
    }
}
class threads1 extends Thread{

    public void runnable() {
        int i = 1;
        while (i >= 10) { // Print "hello" ten times
            System.out.println(i + "world");
            i++;
        }
    }
}
