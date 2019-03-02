import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest2 {
    public static void main(String []args){
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/Iotest2.java");
            out = new FileOutputStream("simpleIOTest2.txt");
            int count = -1;
            byte[] buffer = new byte[512];
            while((count = in.read(buffer))!=-1){
                System.out.println(count);
                out.write(buffer, 0, count);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                out.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
