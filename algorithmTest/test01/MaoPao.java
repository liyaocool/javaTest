package algorithmTest.test01;

/**
 * 冒泡排序: 3,1,6,2,5
 * <p>
 * 第1次循环(内部4次比较换位) 3,1,6,2,5
 * 1,3,6,2,5
 * 1,3,6,2,5
 * 1,3,2,6,5
 * 1,3,2,5,6
 * <p>
 * 第2次循环(内部3次比较) 1,3,2,5
 * 1,3,2,5
 * 1,2,3,5
 * <p>
 * 第3次循环(内部2次比较) 1,2,3
 * 1,2,3
 * 1,2,3
 * <p>
 * 第4次循环(内部1次比较)  1,2
 * 1,2
 */

public class MaoPao {
    public static void main(String[] args) {
        //原始数据
        int[] arr = {3, 1, 6, 2, 5};

        //从小到大排序
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //前面大于后面,则交换位置,大数后移
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        //遍历数组,打印每个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
