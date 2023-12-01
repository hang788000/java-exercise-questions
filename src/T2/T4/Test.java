package T2.T4;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 18:10
 */
public class Test {
    public static void main(String[] args) {
        Table t = new Table("老板桌",1,10,10,10);
        System.out.println("桌子的面积为："+t.area());
        t.setWeight(10);
        t.display();
    }
}
