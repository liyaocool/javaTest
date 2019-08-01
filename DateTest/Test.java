package DateTest;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Test {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();

        //默认时间本地化语言格式
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy年MM月dd日 E HH:mm:ss SSS");
        String dateStr1 = dataFormat.format(d1);
        System.out.println("格式化后的时间:" + dateStr1);


        //本地化日期语言 转 默认日期
        String dateStr2 = "2019年08月01日 21:55:30 888";
        SimpleDateFormat dataParse = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        Date t = dataParse.parse(dateStr2);
        System.out.println("字符转Date:"+t);

        //时间戳起点 到 1000后的日期;
        Date d2 = new Date(1000);
        System.out.println(d2);

        //当前时间戳的前10分钟
        System.out.println(new Date(System.currentTimeMillis() - 10*60*1000));

        //
    }
}
