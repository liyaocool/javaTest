package strems.taskTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author liyao
 * @version 1.0
 * @date 2020/3/24 16:44
 */
public class RunTest {
    public static void main(String[] args) {
        //TaskBean hashCode已经做过处理
        TaskBean t1 = new TaskBean(1, "111");
        TaskBean t2 = new TaskBean(1, "111");
        TaskBean t3 = new TaskBean(1, "222");
        TaskBean t4 = new TaskBean(2, "222");
        TaskBean t5 = new TaskBean(3, "333");
        List<TaskBean> taskBeans = Arrays.asList(t1, t2, t3, t4, t5);
        System.out.println("equls: " + t1.equals(t2));

        System.out.println("====原始集合======");
        System.out.println(taskBeans);

        System.out.println("========选出分数为1的，去除重复的，按照状态倒序的，前三个，归集为List========");
        List<TaskBean> tasks = taskBeans.stream()
                .filter(t -> t.getPoint() == 1)
                .distinct()
                .sorted(Comparator.comparing(TaskBean::getStatus).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(tasks);

        System.out.println("========筛选出状态为222的，重新设置状态为999，归集为List========");
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
        System.out.println(newTasks);

        System.out.println("=====是否能找到分数为6的====");
        boolean isHasPoint_6 = taskBeans.stream()
                .anyMatch(taskBean -> taskBean.getPoint() == 6);
        System.out.println("结果：" + isHasPoint_6);

        System.out.println("=====是否所有的任务分数都为1====");
        boolean allPointIs_1 = taskBeans.stream()
                .allMatch(taskBean -> taskBean.getPoint() == 1);
        System.out.println("结果：" + allPointIs_1);
    }
}
