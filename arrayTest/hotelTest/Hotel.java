package arrayTest.hotelTest;

/**
 *1,2楼为标准间
 * 3,4楼为双人间,
 * 5楼为豪华间*/


public class Hotel {
    Room [] [] rooms;

    Hotel(){
        this(5,10);
    }

    Hotel(int rows, int cols) {
        rooms = new Room[rows][cols];
        for(int i = 0; i < 2; i++) {

        }

    }

    //预定房间,并输出房间所有信息
    public void order(int rows, int cols) {
        System.out.println("预定" + rows + "楼" + cols + "号房间");
    }

    //退房间,并输出房间所有信息
    public void checkOut(int rows, int cols) {
        System.out.println("退" + rows + "楼" + cols + "号房间");
    }
}
