package T1;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：编写一个Java程序，求1!+2!+…+10!的值，
 * 作者：
 * 日期：2023/12/1 15:21
 */


public class FactoriesSum {
    public static void main(String[] args) {
        func1();
//        func2();
    }

    // 动态规划法 时间复杂度  O(n)
    private static void func1() {
        int res = 0;
        int cur = 1;
        for (int i = 1; i <= 10; i++) {
            cur *= i;
            res += cur;
        }
        System.out.println(res);
    }



    // 暴力法 时间复杂度  O(n^2)
    private static void func2() {
        int res = 0;
        for (int i = 1; i <= 10; i++) {
            res += factorial(i);
        }
        System.out.println(res);
    }


    private static int factorial(int n) {
        if (n <= 1) return 1;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }


}
