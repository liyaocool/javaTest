package streamTest.copyTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 复制文件都内容到另一个文件中
 * 输入流,
 * 输出流
 */

public class CopyTextTest {
    private static String msg;

    public static void main(String[] args) {

        runInput(msg);

    }

    private static void runInput(String msg){
        //声明输入流
        FileInputStream fis = null;
        //读,并把读到都内容赋值到msg上;
        try {
            String filePath = "text1.txt"; //待读取文件的路径
            fis = new FileInputStream(filePath); //创建输入流
            byte[] bytes = new byte[1024]; //每次最大可读取1KB;

            int temp;
            while ((temp = fis.read(bytes)) != -1) {
                msg = new String(bytes, 0, temp);
                System.out.println("读取的内容:"+msg);
                runOutput(msg); //
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void runOutput(String msg) {
        //声明输出流
        FileOutputStream fos = null;
        //写,把msg的内容写进文件内;
        try {
            String filePath = "text2.txt"; //待写入文件的路径,若无此文件则新建;
            fos = new FileOutputStream(filePath, true); //创建输出流,采用追加写入形式,重复内容不会被覆盖;
            byte[] bytes = msg.getBytes();
            fos.write(bytes);
            fos.flush();
            System.out.println("复制完成!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
