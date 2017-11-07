package Lesson4;

/**
 * Created by slash22 on 15.06.2017.
 */
public class ZadachaSravnenieSumi {
    public static void main(String[] args) {
        System.out.println(compareSums(2, 20, 10, 20));
    }

    public static boolean compareSums(int a, int b, int c, int d) {

        boolean resSum = false;
        long sum1 = sum(a, b);
        long sum2 = sum(c, d);
        if (sum1 > sum2)
            resSum = true;
        return resSum;
    }
    public static long sum(int from, int to) {

        long res = 0;
        for (long i = from; i <= to; i++) {
            res += i;
        }
        System.out.println(res);
        return (long) res;
    }
}

