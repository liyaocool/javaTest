package streamTest.fileOutputStreamTest;

import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            String filePath = "text2.txt";
            //创建输出流
            fos = new FileOutputStream(filePath, true);

            //待写入的信息
            String msg = "Hello World!";
            //创建写入量数组
            byte[] bytes = msg.getBytes();

            fos.write(bytes);
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }


}
