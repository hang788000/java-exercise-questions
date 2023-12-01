package T1.T7;

/**
 * 功能：Dog类
 * 作者：
 * 日期：2023/12/1 16:41
 */
public class Dog implements Animal {
    public String name;

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }

    @Override
    public String getAnimalName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }
}
