package java_io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class byte_stream {
    public static void main(String[] args) throws IOException {
        byte b[] ={'e', 'f', 't', 'l', 'p', 'w', 'r'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int x;
        while ((x= bis.read())!=-1){
            System.out.println(x);
        }
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }
}
