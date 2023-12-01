package T1.T7;

/**
 * 功能：测试
 * 作者：
 * 日期：2023/12/1 16:47
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("Tom");
        System.out.println(c.getAnimalName());
        Dog d = new Dog("小黑");
        Simulator s = new Simulator();
        s.playSound(c);
        System.out.println(d.getAnimalName());
        s.playSound(d);
    }
}
