package java_io;
import java.io.*;

public class FileClass {


        public static void main(String[] args) throws Exception
        {
            // select path of any directory on you computer
            File f=new File("C:/Users/Lenovo/IdeaProjects/Java Projects/src");

            System.out.println(f.isDirectory());
            File list[]=f.listFiles();

            for(File x:list)
            {
                System.out.println(x.getParent()+" "+x.getName());
            }

        }
    }

