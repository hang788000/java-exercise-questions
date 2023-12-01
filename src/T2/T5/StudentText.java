package T2.T5;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 18:27
 */
public class StudentText {
    public static void main(String[] args) {
        /*
        本科生"张三",62,55,89
        研究生"李四",78,88,61
         */
        Undergraduate u = new Undergraduate("张三",62,55,89);
        Graduate g = new Graduate("李四",78,88,61);
        System.out.printf("本科生%s三门课程的平均分为：%.2f\n",u.getName(),u.getAverage());
        u.isPass();
        System.out.printf("研究生%s三门课程的平均分为：%.2f\n",g.getName(),g.getAverage());
        g.isPass();
    }
}
