package DateTest;

import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d);

        SimpleFormatter sdf = new SimpleFormatter("yyyy-MM-dd HH:mm:ss SSS");
        String dateStr = sdf.format(d);

        System.out.println(dateStr);
    }
}
