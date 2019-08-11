package streamTest.scannerTest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入内容：");
//        String str = s.nextLine();

        //使用

        InputStreamReader isr = new InputStreamReader(System.in); //将输入框字节转字符
        BufferedReader br = new BufferedReader(isr); //将字符流转可缓冲字符流

        String str = br.readLine(); //读取流的一行

        System.out.print("输入了：" + str);
    }
}
