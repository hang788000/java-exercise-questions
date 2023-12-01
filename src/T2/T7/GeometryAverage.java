package T2.T7;

/**
 * 功能：实现几何平均数的运算。
 * 作者：
 * 日期：2023/12/1 21:23
 */
public class GeometryAverage implements CompurerAverage {
    public double a;
    public double b;
    public double c;

    @Override
    public double average() {
        return Math.pow(a * b * c, (double) 1 / 3);
    }

    public GeometryAverage(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
