package T1.T7;

/**
 * 功能：Cat类
 * 作者：
 * 日期：2023/12/1 16:43
 */
public class Cat implements Animal{
    public String name;
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }

    @Override
    public String getAnimalName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }
}
