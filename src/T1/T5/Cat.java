package T1.T5;

/**
 * 功能：来设计“猫”类
 * 作者：
 * 日期：2023/12/1 15:54
 */
public class Cat extends Animal{
    public String name;
    public int age;
    public String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void catchAnimal(Animal an) {
        System.out.println(name+"捉住了"+an.name);
    }

}
