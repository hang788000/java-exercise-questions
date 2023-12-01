package T2.T5;

/**
 * 功能：本科生类
 * 作者：
 * 日期：2023/12/1 18:19
 */
public class Undergraduate extends Student {
    public Undergraduate(String name, double courseA, double courseB, double courseC) {
        super(name, courseA, courseB, courseC);
    }

    public void isPass() {
        if (getAverage()>=60) {
            System.out.println("可以拿到本科生学位");
        }else {
            System.out.println("不能拿到本科生学位");
        }
    }


}
