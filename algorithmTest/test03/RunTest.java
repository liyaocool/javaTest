package algorithmTest.test03;

public class RunTest {
    public static void main(String[] args) {
        //原始数据
        int[] arr = {1, 2, 13, 24, 35, 56, 77, 98, 119, 210};
        //查找位置
        BinarySearch bs1 = new BinarySearch(arr,77);
        BinarySearch bs2 = new BinarySearch(arr,999);
        //打印结果
        System.out.println(bs1.printIndex());
        System.out.println(bs2.printIndex());
    }
}
