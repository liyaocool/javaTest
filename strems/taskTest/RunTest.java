package strems.taskTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liyao
 * @version 1.0
 * @date 2020/3/24 16:44
 */
public class RunTest {
    public static void main(String[] args) {
        Collection<TaskBean> taskBeans = Arrays.asList(
                new TaskBean(1, "111"),
                new TaskBean(1, "112"),
                new TaskBean(1, "222"),
                new TaskBean(2, "222"),
                new TaskBean(3, "333")
        );
        //统计point为1的taskben总和
        List<String> tasks = taskBeans.stream()
                .filter(t -> t.getPoint() == 1)
                .map(TaskBean::getStatus)
                .limit(3)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(tasks);
        System.out.println("================");
//        List<TaskBean> newTasks = taskBeans.stream()
//                .filter(t -> "222".equals(t.getStatus()))
//                .map(t -> {
//                    t.setStatus("999");
//                    return t;
//                })
//                .collect(Collectors.toList());
        //peek()窥视函数 特殊的map(). 传入的参数和 抛出的数据 相同
        List<TaskBean> newTasks = taskBeans.stream()
                .filter(t -> "222".equals(t.getStatus()))
                .peek(t -> t.setStatus("999"))
                .collect(Collectors.toList());
        for (TaskBean taskBean:newTasks
             ) {
            System.out.println(taskBean.toString());
        }
    }
}
