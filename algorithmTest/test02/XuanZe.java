package algorithmTest.test02;

/**
 * 选择排序 3,1,6,2,5
 * <p>
 * 找出最小,拍在前,
 * 然后同理再剩余都找出最小,排在前
 * <p>
 * <p>
 * 第一次循环
 * 1,3,6,2,5
 * <p>
 * 第二次循环
 * 2,3,6,5
 * <p>
 * 第三次循环
 * 3,6,5
 * <p>
 * 第四次循环
 * 5,6
 */

public class XuanZe {
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 2, 5};

        //排序,从数组下标i=0开始到最大下标,循环
        for (int i = 0; i < arr.length - 1; i++) {
            //暂定第一个为最小值;
            int min = i;

            //从下标i开始到数组最大下标,比较找出 较小值 的下标 赋值给min
            for (int j = i; j < arr.length - 1; j++) {
                //如果
                if (arr[min] > arr[j + 1]) {
                    min = j + 1;
                }
            }

            //考虑交换位置,min != i,说明上方查询出更小值
            if (min != i) {
                int temp;
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
