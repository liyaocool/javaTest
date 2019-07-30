package arrayTest.hotelTest;

public class Room {
    private String num; //房间序号
    private String type; //房间类型,标准间,双人间, 豪华间
    private boolean isUsed; //true被使用, false 空置中

    public Room() {
        super();
    }

    Room(String num, String type, boolean isUsed) {
        super();
        this.num = num;
        this.type = type;
        this.isUsed = isUsed;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUsed() {
        return this.isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public String toString() {
        return "[" + num + "," + type +"," + (isUsed ? "占用" : "空闲") + "]";
    }
}
