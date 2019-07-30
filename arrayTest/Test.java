package arrayTest;

public class Test {
    public static void main(String[] args) {
        int[] intArr = {1, 34, 4345};
        int[] intArr2 = new int[3];
        String[] strArr = {"adfsa", "123", "as"};
        char[] charArr = {'a', 'c', '3'};


        Object O1 = new Object();
        Object O2 = new Object();
        Object O3 = new Object();
        Object[] objArr = {O1, O2, O3};


        int[] src = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] dest = {10, 11, 12, 13, 14, 15, 16};

        System.arraycopy(src, 2, dest, 2, 3);
        for (int i = 0; i < dest.length; i++) {

            System.out.println(dest[i]);
        }
    }
}
