package errorTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test01 {
    public static void main(String[] args) {
        //外部声明,为了让finally拿到变量
        FileInputStream files = null;

        try {
            files = new FileInputStream("README_1.md");
        } catch (FileNotFoundException e) {
            //准备捕捉找不到文件的错误,并打印堆栈的错误信息
            e.printStackTrace();
        } finally {
            //如果没读取到文件,files仍未null,不做释放处理
            if (files != null) {
                try {
                    files.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
