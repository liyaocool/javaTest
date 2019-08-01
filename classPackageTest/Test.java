package classPackageTest;

public class Test {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        System.out.println("int最小值" + Integer.MIN_VALUE);
        System.out.println("int最大值" + Integer.MAX_VALUE);
        Integer i1 = 129;
        Integer i2 = 129;

        System.out.println(i1 == i2);
    }
}
