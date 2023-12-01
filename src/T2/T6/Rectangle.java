package T2.T6;

/**
 * 功能：矩形
 * 作者：
 * 日期：2023/12/1 21:08
 */
public class Rectangle extends Geometry{
    public double length;
    public double width;


    @Override
    public double getArea() {
        return length*width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
