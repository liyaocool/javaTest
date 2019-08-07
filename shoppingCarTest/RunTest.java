package shoppingCarTest;

public class RunTest {
    public static void main(String[] args) {
        //创建购物车
        ShoppingCar car = new ShoppingCar();


        //上架商品
        Goods g1 = new Goods(1000,"番茄",3.50);
        Goods g2 = new Goods(1002,"苹果",6.50);
        Goods g3 = new Goods(2000,"西瓜",2.90);
        Goods g4 = new Goods(2003,"橘子",9.50);

        //开始购物
        car.add(g1,2);
        car.add(g2,3);
        car.add(g3,4);
        car.add(g4,1);

        //删除商品
        car.remove(g1,3);
        car.remove(g2,2);
        car.remove(g3,2);
        car.remove(g4,2);

        //清空购物车
//        car.clear();

        //打印购物单
        car.printGoods();
    }
}
