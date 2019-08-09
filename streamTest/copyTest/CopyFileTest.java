package streamTest.copyTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 复制文件都内容到另一个文件中
 * 输入流,
 * 输出流
 */

public class CopyFileTest {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void run() throws Exception {
        //声明输入流
        FileInputStream fis = null;
        //声明输出流
        FileOutputStream fos = null;

        //读,并把读到都内容赋值到msg上;
        String filePath = "img1.jpg"; //待读取文件的路径
        fis = new FileInputStream(filePath); //创建输入流

        String filePath2 = "img2.jpg"; //待写入文件的路径,若无此文件则新建;
        fos = new FileOutputStream(filePath2); //创建输出流,不用追加写入形式,重复文件会被覆盖;

        byte[] bytes = new byte[1024]; //每次最大可读取1KB;

        //边读边写,读多少写多少size
        int size;
        while ((size = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, size);
        }
        //刷新
        fos.flush();
        System.out.println("多格式文件复制完成");
        //关闭流
        fis.close();
        fos.close();
    }
}
