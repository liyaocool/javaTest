package collectionTest.test01;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        Integer i1 = 111;

        c.add(i1);

        System.out.println(c.contains(i1)); //true

        Integer i2 = 111;
        System.out.println(c.contains(i2)); //true, contains底层是 Integer.equals()已经被重写,比较内容

        People p1 = new People(1, "jack");
        c.add(p1);
        System.out.println(c.contains(p1)); //true

        People p2 = new People(1, "jack");
        System.out.println(c.contains(p2)); //false,因为比较都是对象都内存地址. 想要true,得重写People底层equals()方法

        //迭代器
        Iterator it = c.iterator();

//        for (Iterator it = c.iterator(); it.hasNext(); ) {
//            Object o = it.next();
//            System.out.println(o);
//        }

    }


}

class People {
    int id;
    String name;

    People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //重写equals后,上方contains()方法会只比较相关对象属性,而不再是比较各自对象引用地址
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof People) {
//            People o = (People) obj;
//            if (o.id == this.id && o.name.equals(this.name)) {
//                return true;
//            }
//        }
//        return false;
//    }
}

