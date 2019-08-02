package numberTest;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/*
 * # ==>任意数字
 * , ==>千分位
 * . ==>小数点
 * 0 ==>不够0补上*/

public class Test {
    public static void main(String[] args) {
        //加入千分位
        DecimalFormat df1 = new DecimalFormat("###,###");


        //加入千分位,并四舍五入保留小数点后两位
        DecimalFormat df2 = new DecimalFormat("###,###.##");

        //加入千分位,四舍五入保留小数点后4位,并且不够位补0
        DecimalFormat df3 = new DecimalFormat("###,###.0000");
        System.out.println(df1.format(1234.567));
        System.out.println(df2.format(1234.567));
        System.out.println(df3.format(1234.567));


        //财务软件高精确度,BigDecimal使用
        BigDecimal b1 = new BigDecimal(343123456.123456789);
        BigDecimal b2 = new BigDecimal(343223456.123456789);

        //进行加法运算  不可用b1 +b2, 两个引用类型不能直接运算符操作
        BigDecimal b3 = b1.add(b2);
        System.out.println("高精度运算结果:" + b3);

        DecimalFormat df4 = new DecimalFormat("#,###.000000000");
        System.out.println("按需求格式化结果:" + df4.format(b3));

        //创建随机数生成器
        Random r = new Random();

        int i = r.nextInt(100); //0~100范围
        System.out.println("随机数:" + i);

        //创建不重复都 5 个随机数

        int[] arr = new int[5];
        int index = 0;
        while (index < 5) {
            int temp = r.nextInt(5);

            if (temp != 0 && !contains(arr, temp)) {
                arr[index++] = temp;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

    public static boolean contains(int[] array, int temp) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == temp) {
                return false;
            }
        }
        return false;
    }
}
