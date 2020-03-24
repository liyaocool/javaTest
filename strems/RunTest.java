package strems;

import javafx.concurrent.Task;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author liyao
 * @version 1.0
 * @date 2020/3/24 16:44
 */
public class RunTest {
    public static void main(String[] args) {
        Collection<TaskBean> taskBeans = Arrays.asList(
                new TaskBean(1, "111"),
                new TaskBean(1, "111"),
                new TaskBean(3, "222")
        );
        //统计point为1的taskben总和
        long points = taskBeans.stream().filter(task ->
                task.point == 1
        ).mapToLong(TaskBean::getPoint).sum();

        System.out.println(points);
    }
}
