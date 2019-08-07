package shoppingCarTest;

public class Goods {
    private int no; //编号,规格[1000~9999]}
    private String name; //商品名
    private double price = 0.00; //单价

    //Constructor
    public Goods() {
    }

    public Goods(int no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }


    //setter/getter
    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    //重写
    public String toString() {
        return "编号:[" + no + "]\t" + name + "\t单价:" + price + "元/个";
    }
    //重写
    public int hashCode() {
        return no / 1000; //int 会取整
    }
    //重写
    public boolean equals(Object o) {
        if (o instanceof Goods) {
            Goods g = (Goods) o;
            return g.no == this.no && g.name.equals(this.name);
        }
        return false;
    }
}
