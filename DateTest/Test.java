package DateTest;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();

        //默认时间本地化语言格式
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy年MM月dd日 E HH:mm:ss SSS");
        String dateStr1 = dataFormat.format(d1);
//        System.out.println("格式化后的时间:" + dateStr1);


        //本地化日期语言 转 默认日期
        String dateStr2 = "2019年08月01日 21:55:30 888";
        SimpleDateFormat dataParse = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        Date t = dataParse.parse(dateStr2);
//        System.out.println("字符转Date:" + t);

        //时间戳起点 到 1000后的日期;
        Date d2 = new Date(1000);
        System.out.println(d2);

        //当前时间戳的前10分钟
//        System.out.println(new Date(System.currentTimeMillis() - 10 * 60 * 1000));


        //获取当前系统日历

        //创建日历,默认获取当天
        Calendar c1 = Calendar.getInstance();

        int month = c1.get(Calendar.MONTH);
        int week = c1.get(Calendar.DAY_OF_WEEK);
        int day = c1.get(Calendar.DAY_OF_MONTH);
//        System.out.println("今天是:星期" +week + "," + day + "号"); //国外的每周的第一天是星期天

        //查询 "2008年08年08号" 是星期几
        String testString = "2008年08年08号";
        /*SimpleDateFormat testFormat = new SimpleDateFormat("yyyy年MM年dd号");
        Date testDate = testFormat.parse(testString);*/
        Date testDate = new SimpleDateFormat("yyyy年MM年dd号").parse(testString);

        //重设日历天
        c1.setTime(testDate);

        //获取周几
//        System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //6,星期五
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)-1); // 设置为上一个月
        date = calendar.getTime();
        String accDate = dataFormat.format(date);
        System.out.println(accDate);
    }
}
