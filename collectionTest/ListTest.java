package collectionTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyao
 * @version 1.0
 * @date 2020/3/19 14:39
 */
public class ListTest {
    public static void main(String[] args) {
        int start = (2 - 1) * 2 + 1;
        int end = 2 * 2;
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list.subList(start-1,end));
    }
}
