package streamTest.configTest;

import java.io.FileInputStream;
import java.util.Properties;

public class RunTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties p = new Properties();
        p.load(fis);
        fis.close();

        String v = p.getProperty("userName");
        System.out.println(v);
    }
}
