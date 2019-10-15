package otherTest;

import java.util.Scanner;

/**
 * 斐波那契数列求和
 */
public class MyTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("您将求前几项的和:");
        int n = scan.nextInt();
        int sum = MyTest.jisuan(n);
        System.out.println(sum);
        ;
    }

    private static int jisuan(int n) {
        int x = 1, y = 1, sum = 2, temp;
        if (n <= 2) {
            sum = 1;
            return sum;
        }
        for (int i = 3; i <= n; i++) {
            sum = sum + (x + y);
            temp = x;
            x = x + y;
            y = temp;
        }
        return sum;
    }

}

