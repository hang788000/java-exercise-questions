package T2.T6;

/**
 * 功能：圆
 * 作者：
 * 日期：2023/12/1 21:06
 */
public class Circle extends Geometry{
    public double r;

    @Override
    public double getArea() {
        return 3.14*r*r;
    }

    public Circle(double r) {
        this.r = r;
    }
}
