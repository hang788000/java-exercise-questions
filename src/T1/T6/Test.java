package T1.T6;


/**
 * 功能：测试
 * 作者：
 * 日期：2023/12/1 16:33
 */
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);   // 半径为3的圆
        Rectangle r = new Rectangle(2, 3); // 长宽为2*3的矩形
        System.out.println(c.getAreap());
        System.out.println(c.getPerimeter());
        System.out.println(r.getAreap());
        System.out.println(r.getPerimeter());

    }
}
