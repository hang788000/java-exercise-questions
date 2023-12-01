package T1.T8;

/**
 * 功能：SalariedEmployee类
 * 作者：
 * 日期：2023/12/1 16:54
 */
public class SalariedEmployee extends Employee {
    public String name;
    public int month;
    public int Salary;

    @Override
    public int getSalary(int month) {
        return this.month == month ? Salary + 100 : Salary;
    }

    public SalariedEmployee(String name, int month, int Salary) {
        this.name = name;
        this.month = month;
        this.Salary = Salary;
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
}
