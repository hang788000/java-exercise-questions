package T2;

/**
 * 功能：输出满足1+2+3+...+n>10000的最小正整数n
 * 作者：
 * 日期：2023/12/1 18:01
 */
public class IntegerMin {
    public static void main(String[] args) {
        int res = 0;
        int i = 1;
        while (res <= 10000) {
            res += i++;
        }
        System.out.println(--i);
    }
}
