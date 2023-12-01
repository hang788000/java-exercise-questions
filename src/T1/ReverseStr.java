package T1;

import java.util.Scanner;

/**
 * 功能：反转字符串中单词的顺序
 * 作者：
 * 日期：2023/12/1 17:28
 */
public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] split = s.split("\\s");  // 正则表达式 分割
        int len = split.length;
        for (int i = 0; i < split.length/2; i++) {
            String tmp = split[i];
            split[i]=split[len-i-1];
            split[len-i-1]=tmp;
        }
        StringBuilder res = new StringBuilder();
        for (String string : split) {
            res.append(string).append(" ");
        }
        System.out.println(res.toString());

    }
}
