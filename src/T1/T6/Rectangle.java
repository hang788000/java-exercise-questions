package T1.T6;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 16:31
 */
public class Rectangle extends Shape {
    private double length;  // 长
    private double width;   // 宽


    @Override
    public double getAreap() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
