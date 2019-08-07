package shoppingCarTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShoppingCar {
    Map<Goods, Integer> GoodsMaps;

    double totalPrice;

    //Constructor
    ShoppingCar() {
        GoodsMaps = new HashMap<Goods, Integer>();
    }

    //添加一个商品
    public void add(Goods g) {
        add(g, 1);
    }

    //添加N个商品
    public void add(Goods g, int n) {

        if (GoodsMaps.containsKey(g)) {
            //如果有该商品
            int before = GoodsMaps.get(g);
            int after = before + n;

            GoodsMaps.put(g, after);
            totalPrice += g.getPrice() * after;
        } else {
            //若没有该商品
            GoodsMaps.put(g, n);//自动装箱
            totalPrice += g.getPrice() * n;
        }
    }

    //删除一个商品
    public void remove(Goods g) {
        remove(g, 1);
    }

    //删除N个商品
    public void remove(Goods g, int n) {
        if (GoodsMaps.containsKey(g)) {
            //如果有该商品
            int before = GoodsMaps.get(g); //购物车内数量
            if (before <= n) {
                //如移除量大等于购物车内量,即全移除
                GoodsMaps.remove(g);
                totalPrice -= g.getPrice() * before;
            } else {
                int after = before - n;
                GoodsMaps.put(g, after);
                totalPrice -= g.getPrice() * after;
            }

        } else {
            //若没有该商品
            System.out.println("抱歉!您的购物车没有["+g.getName()+"],无法移除操作.\n");
        }
    }

    //清空购物车
    public void clear() {
        GoodsMaps.clear();
        totalPrice = 0.00;
    }

    //打印购物清单
    public void printGoods() {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\t\t\t\t\t购物清单\n");
        sb.append("=======================================================\n");

        //遍历Map
        Set<Goods> key = GoodsMaps.keySet();
        Iterator<Goods> it = key.iterator();
        if (GoodsMaps.isEmpty()) {
            sb.append("\t\t\t\t抱歉,您的购物车空空如也~\n");
        } else {
            while (it.hasNext()) {
                Goods k = it.next();
                Integer v = GoodsMaps.get(k);
                sb.append(k + "\t" + "数量:" + v + "\t价格:" + v * k.getPrice() + "元" + "\n");
            }
        }
        sb.append("=======================================================\n");
        sb.append("\t\t\t\t\t\t\t\t\t\t\t总价:" + totalPrice + "元");
        System.out.println(sb);
    }
}
