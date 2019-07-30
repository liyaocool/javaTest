package arrayTest.hotelTest;

/**
 * 1,2楼为标准间
 * 3,4楼为双人间,
 * 5楼为豪华间
 */


public class Hotel {
    private Room[][] rooms;

    Hotel() {
    }

    Hotel(int rows, int cols) {
        rooms = new Room[rows][cols];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0 || i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1 + "", "标准间", false);
                } else if (i == 2 || i == 3) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1 + "", "双人间", false);
                } else {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1 + "", "豪华间", false);
                }
            }
        }

    }

    public void showRooms() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    //预定房间,并输出房间所有信息
    public void order(String num) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getNum().equals(num)) {
                    if(rooms[i][j].isUsed()){
                        System.out.println("抱歉,"+ rooms[i][j].getNum()+"房间已被他人预订.");
                        return;
                    }
                    rooms[i][j].setUsed(true);
                    System.out.println("预定成功");
                }
            }
        }
    }

}
