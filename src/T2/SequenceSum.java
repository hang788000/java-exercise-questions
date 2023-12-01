package T2;


/**
 * 功能：使用for循环语句计算5+55+555+5555+...的前10项之和
 * 作者：
 * 日期：2023/12/1 17:56
 */
public class SequenceSum {
    // 用long类型或BigInteger 否则会超出int类型最大值
    public static void main(String[] args) {
        long res = 0;
        for (int i = 1; i <= 10; i++) {
            res += func(i);
        }
        System.out.println("5+55+555+5555+...的前10项之和=" + res);
    }

    private static long func(int n) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            res = res * 10 + 5;
        }
        return res;
    }

}
