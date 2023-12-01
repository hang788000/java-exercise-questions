package T2.T7;

/**
 * 功能：算术平均数的运算
 * 作者：
 * 日期：2023/12/1 21:22
 */
public class ArithmeticAverage implements CompurerAverage{
    public double a;
    public double b;
    public double c;

    @Override
    public double average() {
        return (a+b+c)/3;
    }

    public ArithmeticAverage(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
