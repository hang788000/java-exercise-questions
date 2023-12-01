package T2.T7;

import java.util.Scanner;

/**
 * 功能：测试
 * 作者：
 * 日期：2023/12/1 21:25
 */
public class TestAverage {
    public static void main(String[] args) {
        double a=11,b=12,c=15;
        ArithmeticAverage aa = new ArithmeticAverage(a,b,c);
        GeometryAverage ga = new GeometryAverage(a,b,c);
        System.out.printf("%.2f,%.2f和%.2f的算数平均值：%.2f\n",a,b,c,aa.average());
        System.out.printf("%.2f,%.2f和%.2f的算数平均值：%.2f\n",a,b,c,ga.average());

    }
}
