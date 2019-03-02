import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest {
    public static void main(String []args){
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/IoTest.java");
            out = new FileOutputStream("simpleIOTest.txt");
            int input = -1;
            while((input = in.read())!=-1){
                out.write(input);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                in.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                out.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
