package T1.T8;

/**
 * 功能：SalesEmployee类
 * 作者：
 * 日期：2023/12/1 17:05
 */
public class SalesEmployee extends Employee {
    public String name;
    public int month;
    public int MonthlySales;
    public int Submission;

    @Override
    public int getSalary(int month) {
        int res = this.month == month ? MonthlySales + 100 : MonthlySales;
        return res + Submission;
    }

    public SalesEmployee(String name, int month, int monthlySales, int submission) {
        this.name = name;
        this.month = month;
        this.MonthlySales = monthlySales;
        this.Submission = submission;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getMonthlySales() {
        return MonthlySales;
    }

    public int getSubmission() {
        return Submission;
    }
}
