package T2.T5;

/**
 * 功能：Student类
 * 作者：
 * 日期：2023/12/1 18:17
 */
public class Student {
    String name;
    double courseA;
    double courseB;
    double courseC;

    public Student(String name, double courseA, double courseB, double courseC) {
        this.name = name;
        this.courseA = courseA;
        this.courseB = courseB;
        this.courseC = courseC;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (courseA + courseB + courseC) / 3;
    }
}
