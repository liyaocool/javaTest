package streamTest.copyTest;

import java.io.FileWriter;
import java.io.FileReader;

/**
 * 复制文件都内容到另一个文件中
 * 输入流,
 * 输出流
 */

public class CopyTextTest {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void run() throws Exception {
        //声明输入流
        FileReader fr = null;
        //声明输出流
        FileWriter fw = null;

        //读,并把读到都内容赋值到msg上;
        String filePath = "text1.txt"; //待读取文件的路径
        fr = new FileReader(filePath); //创建输入流

        String filePath2 = "text2.txt"; //待写入文件的路径,若无此文件则新建;
        fw = new FileWriter(filePath2); //创建输出流,不用追加写入形式,重复文件会被覆盖;

        char[] chars = new char[1024]; //每次最大可读取1KB;

        //边读边写,读多少写多少size
        int size;
        while ((size = fr.read(chars)) != -1) {
            fw.write(chars, 0, size);
        }
        //刷新
        fw.flush();
        System.out.println("文本复制完成");
        //关闭流
        fr.close();
        fw.close();
    }
}
