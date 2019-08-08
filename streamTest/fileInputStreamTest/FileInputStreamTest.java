package streamTest.fileInputStreamTest;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            String filePath = "text1.txt";

            //创建流
            fis = new FileInputStream(filePath);

            //读
            byte[] bytes = new byte[3]; //每次最大读取3字节
//            while (true) {
//                int content = fis.read(bytes);
//                if (content == -1) break;
//                System.out.print(new String(bytes,0,content));
//            }

            //升级循环
            int temp;
            while ((temp = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,temp));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
