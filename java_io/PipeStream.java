package java_io;

import java.io.*;
class Producer extends Thread{
    public Producer(OutputStream o){
        os = o;
    }
    OutputStream os;
    public void run(){
        int count = 1;
        while (true){
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer: " +count);
                System.out.println();
                count++;
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class Consumer extends  Thread
{
    InputStream Is;
    public Consumer (InputStream s){
        Is = s;
    }
    public void run(){
        int x = 1;
        while (true){
            try {
                x = Is.read();
                System.out.println("consumer: "+x);
                System.out.flush();
                Thread.sleep(10);

            }
            catch (Exception e){
                System.out.println(e);
            }
            }
        }

}
public class PipeStream {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();

        c.start();


    }
}
