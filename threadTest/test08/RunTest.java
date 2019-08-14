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

        timer.schedule(new Task(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-8-14 15:02:00 000"),5000);


    }

}

class Task extends TimerTask {
    @Override
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
}
