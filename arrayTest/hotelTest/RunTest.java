package arrayTest.hotelTest;

public class RunTest {
    public static void main(String[] args) {
        //初始化酒店房间
        Hotel hotel = new Hotel(5,10);

        //展示所有房间信息
        System.out.println("欢迎使用酒店预定系统,房间信息如下:");
        hotel.showRooms();
        System.out.print("请输入您想预定的房间号:");
        hotel.order("101");
    }
}
