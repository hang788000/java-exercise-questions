package T1;

/**
 * 功能：求100-999之间的水仙花数，
 * 作者：
 * 日期：2023/12/1 15:37
 */
public class Narcissus {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (func(i)) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean func(int n) {
        int res = 0;
        String s = n + "";
        for (int i = 0; i < s.length(); i++) {
            int tmp = (int) (s.charAt(i) - '0');
            res += (int) Math.pow(tmp, 3);
        }
        return res == n;
    }
}
