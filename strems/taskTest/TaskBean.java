package strems.taskTest;

/**
 * @author liyao
 * @version 1.0
 * @date 2020/3/24 16:51
 */
public class TaskBean {
    private  long point;
    private  String status;

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
}
