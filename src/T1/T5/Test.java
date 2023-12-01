package T1.T5;

/**
 * 功能：测试
 * 作者：
 * 日期：2023/12/1 15:58
 */
public class Test {
    public static void main(String[] args) {
        Animal l = new Animal();
        l.name="Jerry";
        Cat c = new Cat("Tom",10,"黑");
        c.catchAnimal(l);
        l.eat("大米");
        l.move();
    }
}
