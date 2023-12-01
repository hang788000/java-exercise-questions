package T2.T6;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 21:14
 */
public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(40,3);
        Circle c = new Circle(10);
        Triangle t = new Triangle(3,4,5);
        PillarL p1 = new PillarL(r,10);
        PillarL p2 = new PillarL(c,10);
        PillarL p3 = new PillarL(t,10);
        System.out.println("四棱柱体积为："+p1.getVolume());
        System.out.println("圆柱体体积为："+p2.getVolume());
        System.out.println("三棱柱体积为："+p3.getVolume());
    }
}
