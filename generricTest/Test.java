package generricTest;
/*
泛型使用
 */

public class Test {
    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7};
        String[] stringArray = {"abc", "def", "htc"};
        Double[] doubleArray = {1.2, 2.2, 3.3};

        printArray(intArray);
        printArray(stringArray);
        printArray(doubleArray);
    }

    //泛型打印,传参数 inputArray
    private static <E> void printArray(E[] inputArray) {
        //输出数组元素
        for (E element : inputArray
        ) {
            System.out.print(element + ",");
        }
        System.out.println();
    }
}
