package algorithmTest.test03;

/**
 * 对已排序都数组,进行二分法快速搜索
 */

public class BinarySearch {
    private int[] arr;
    private int dest;

    BinarySearch(int[] arr, int dest) {
        this.arr = arr;
        this.dest = dest;
    }

    public String printIndex() {
        int begin=0;
        int end = arr.length - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;

            if (arr[mid] == dest) {
                return dest+"的下标是"+mid;
            } else if (arr[mid] > dest) {
                end = mid - 1;
            } else if (arr[mid] < dest) {
                begin = mid + 1;
            }
        }
        return dest+"不在数组中!";
    }
}
