package T2.T8;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 21:31
 */
public class givePriceSum {
    public double getPriceSum(String shoppingReceipt) {
        String regex = "[^0123456789.]+";
        shoppingReceipt = shoppingReceipt.replaceAll(regex, "#");
        StringTokenizer fenxi = new StringTokenizer(shoppingReceipt, "#");
        double sum = 0;
        while (fenxi.hasMoreTokens()) {
            String item = fenxi.nextToken();
            double price = Double.parseDouble(item);
            sum += price;
        }
        return sum;
    }


    /* 不用StringTokenizer和正则的方法
       动态指针
       如果符合小数的格式就放到StringBuilder里面 (StringBuffer也可)
     */
    public double getP(String s) {

        double res = 0;
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9' || c == '.') {
                tmp.append(c);
            } else if (!tmp.isEmpty()) {
                res += Double.parseDouble(tmp.toString());
                tmp.delete(0, tmp.toString().length());  // 清空
            }
        }
        // 清空tmp里面的数
        if (!tmp.isEmpty()) res += Double.parseDouble(tmp.toString());
        return res;
    }
}
