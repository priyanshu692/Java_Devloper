package java_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/Lenovo/IdeaProjects/Java Projects/src/java_io/test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println((char)bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.mark(10);
        System.out.println((char) bis.read());
        bis.reset();
        System.out.println("File: "+fis.markSupported());
        System.out.println("Buffer: "+bis.markSupported());
    }
}
