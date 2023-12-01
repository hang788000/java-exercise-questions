package T2.T4;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 18:05
 */
public class Table {
    public String name;
    public int weight;
    public int width;
    public int length;
    public int height;

    public Table() {
    }

    public Table(String name, int weight, int width, int length, int height) {
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double area() {
        return weight*length;
    }

    public void display() {
        System.out.println("这个桌子的名字是："+name);
        System.out.println("这个桌子的重量为"+weight);
        System.out.println("这个桌子的长宽高分别为"+length+" "+width+" "+height);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
