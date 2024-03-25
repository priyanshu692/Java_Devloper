package java_io;

import java.io.*;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class fileIoStream {
    public static void main(String[] args) {
        try {


            FileOutputStream fos =
                    new FileOutputStream("C:/Users/Lenovo/IdeaProjects/Java Projects/src/java_io/test.txt");
            String str = "hello java";
            fos.write(str.getBytes());
            fos.close();

            FileInputStream fis =
                    new FileInputStream("C:/Users/Lenovo/IdeaProjects/Java Projects/src/java_io/test.txt");
            byte b[] = new byte[fis.available()];
            fis.read();
            String str1 = new String(b);
            System.out.println(str1);

        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
