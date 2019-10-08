package threadTest.test08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
定时器,
定时任务
 */
public class RunTest {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-10-08 13:19:00 000");
        timer.schedule(new Task(),date,5000);


    }

}

class Task extends TimerTask {
    @Override
    public void run() {
        String time_str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date());
        System.out.println(time_str);
        System.out.println("执行方法!");
    }
}
