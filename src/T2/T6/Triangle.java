package T2.T6;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 21:09
 */
public class Triangle extends Geometry {
    public double a;
    public double b;
    public double c;


    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

