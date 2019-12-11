package collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<String> dateList = new ArrayList<>();
        dateList.add("2019-07");
        dateList.add("2019-08");
        dateList.add("2019-09");
        dateList.add("2019-10");
        dateList.add("2019-11");
        dateList.add("2019-12");
        System.out.println("要求显示月份："+dateList);

        List<Map> dataList = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("RQ", "2019-07");
        map1.put("SJ", 11);
        dataList.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("RQ", "2019-08");
        map2.put("SJ", 22);
        dataList.add(map2);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("RQ", "2019-10");
        map3.put("SJ", 33);
        dataList.add(map3);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("RQ", "2019-12");
        map4.put("SJ", 44);
        dataList.add(map4);

        System.out.println("实际数据："+dataList);

        System.out.println("以下没有的月份数据，补充0");
        System.out.println("=====================");

        List<Map> list = new ArrayList<>();
        for (String month : dateList) {
            Map<String, Object> newMap = new HashMap<>();
            boolean isHas = false;
            for (Map data1 : dataList) {
                String dataMonth = (String) data1.get("RQ");
                if (month.equals(dataMonth)) {
                    newMap.put("RQ", month);
                    newMap.put("SJ", data1.get("SJ"));
                    isHas = true;
                } else {
                    if (!isHas) {
                        newMap.put("RQ", month);
                        newMap.put("SJ", 0);
                    }
                }
            }
            list.add(newMap);
        }

        System.out.println(list);
    }
}
