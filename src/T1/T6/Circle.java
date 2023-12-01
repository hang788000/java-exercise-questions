package T1.T6;

/**
 * 功能：Circle类
 * 作者：
 * 日期：2023/12/1 16:03
 */
public class Circle extends Shape {
    private double radius;

    @Override
    public double getAreap() {
        return 3.14 * radius * radius;  // π*r^2
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;    // 2*π*r
    }

    public Circle(double radius) {
        this.radius = radius;
    }

}
