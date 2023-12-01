package T1.T8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 功能：测试
 * 作者：
 * 日期：2023/12/1 17:10
 */
public class Test {
    public static void main(String[] args) {
        /*
        创建一个Employee 数组，分别创建若干不同的Employee对象放入Employee 数组中，
        初始化张三为SalariedEmployee类型员工月薪为4000元，生日为5月份；
        李四为HourlyEmployee类型员工，生日为6月份，每小时工资25元，当月工作了200小时；
        王五为SalesEmployee类型员工，生日为7月份，底薪为2500，提成为3000，
        当前要发的是6月份工资，要求打印结果为：
        张三6月份的工资为4000元
        李四6月份的工资为5600元
        王五6月份的工资为5500元
         */

        List<Employee> list = new ArrayList<>();  // 动态数组
        SalariedEmployee e1 = new SalariedEmployee("张三", 5, 4000);
        HourlyEmployee e2 = new HourlyEmployee("李四", 6, 25, 200);
        SalesEmployee e3 = new SalesEmployee("王五", 7, 2500, 3000);
        Collections.addAll(list, e1, e2, e3);    // 向动态数组中添加元素

        list.forEach(
                s -> System.out.println(s.getName() + "6月份的工资为" + s.getSalary(6) + "元")
        );


    }


//    private static void func()

}