package T1.T8;

/**
 * 功能：HourlyEmployee类
 * 作者：
 * 日期：2023/12/1 16:56
 */
public class HourlyEmployee extends Employee {
    public String name;
    public int month;
    public int Salary;
    public int hour;

    @Override
    public int getSalary(int month) {
        double res = 0;
        if (this.month == month) res += 100;
        if (hour >= 160) {
            res += (int)(hour - 160) * Salary*1.5 + 160 * Salary;
        } else {
            res += hour * Salary;
        }
        return (int) res;
    }

    public HourlyEmployee(String name, int month, int salary, int hour) {
        this.name = name;
        this.month = month;
        this.Salary = salary;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getSalary() {
        return Salary;
    }

    public int getHour() {
        return hour;
    }
}
