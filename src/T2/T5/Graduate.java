package T2.T5;

/**
 * 功能：研究生类
 * 作者：
 * 日期：2023/12/1 18:20
 */
public class Graduate extends Student{
    public Graduate(String name, double courseA, double courseB, double courseC) {
        super(name, courseA, courseB, courseC);
    }

    public void isPass() {
        if (getAverage()>=80) {
            System.out.println("可以拿到研究生学位");
        }else {
            System.out.println("不能拿到研究生学位");
        }
    }

}
