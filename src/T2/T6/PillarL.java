package T2.T6;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 21:04
 */
public class PillarL{
    public Geometry bottom;
    double height;

    double getVolume() {
        return bottom.getArea()*height;
    }

    public PillarL(Geometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }
}
