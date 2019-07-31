package arrayTest.hotelTest;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //初始化酒店房间
        Hotel hotel = new Hotel(5, 10);

        //展示所有房间信息
        System.out.println("欢迎使用酒店预定系统,房间信息如下:");
        hotel.showRooms();


        while (true) {
            System.out.print("请选择功能: (输入1为预定房间,输入2为退订房间)");
            String select = scan.next();

            if (select == null) {
                System.out.print("请选择功能: (输入1为预定房间,输入2为退订房间)");
                select = scan.next();
            } else if ("1".equals(select)) {
                System.out.print("请输入您想预定的房间号:");
                String orderNum = scan.next();
                hotel.order(orderNum);

            } else if ("2".equals(select)) {

                System.out.print("请输入您想退订的房间号:");
                String checkOutNum = scan.next();
                hotel.checkOut(checkOutNum);
            }
            hotel.showRooms();
        }
    }
}
