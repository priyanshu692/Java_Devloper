package java_io;

import javax.imageio.IIOException;
import java.io.*;

public class fileIoStream1 {
    public static void main(String[] args) throws Exception{
        try {


            FileInputStream fis =
                    new FileInputStream("C:/Users/Lenovo/IdeaProjects/Java Projects/src/java_io/Source1.txt");
            FileOutputStream fos =
                    new FileOutputStream("C:/Users/Lenovo/IdeaProjects/Java Projects/src/java_io/Destination.txt");
            FileInputStream fis2 = new FileInputStream("C:/Users/Lenovo/IdeaProjects/Java Projects/src/java_io/Source2.txt");
            SequenceInputStream se = new SequenceInputStream(fis,fis2);

            int b;
            while ((b = fis.read()) != -1) {
                if (b>=65&&b<=120)
                    fos.write(b+20);
                else fos.write(b);

            }
            se.close();
            fis.close();
            fis2.close();
            fos.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
