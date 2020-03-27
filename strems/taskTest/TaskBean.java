package strems.taskTest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;

/**
 * @author liyao
 * @version 1.0
 * @date 2020/3/24 16:51
 */
public class TaskBean {
    //任务分数
    private long point;
    //任务状态
    private String status;

    public TaskBean(long point, String status) {
        this.point = point;
        this.status = status;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TaskBean: { point:" + this.getPoint() + ", status:" + this.getStatus() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (obj instanceof TaskBean){
            TaskBean taskBean = (TaskBean) obj;
            return taskBean.point == this.point && taskBean.status.equals(this.status);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
