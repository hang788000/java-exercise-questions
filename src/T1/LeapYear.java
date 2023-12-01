package T1;

/**
 * 功能：输出1949年-2023年内的闰年，要求按行输出，一行5个年份，用空格分隔
 * 作者：
 * 日期：2023/12/1 15:44
 */
public class LeapYear {
    public static void main(String[] args) {
        // 2000 年是闰年
        int cnt = 0;
        for (int i = 1949; i <= 2023; i++) {
            if (func(i)) {
                System.out.print(i+" ");
                cnt++;
            }
            if (cnt == 5) {
                System.out.println();
                cnt = 0;
            }
        }

    }

    private static boolean func(int n) {
        return n % 400 == 0 || n % 100 != 0 && n % 4 == 0;
    }
}
