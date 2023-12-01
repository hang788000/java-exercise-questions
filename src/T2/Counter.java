package T2;

import java.util.Scanner;

/**
 * 功能：现输入一行字符串，分别统计出其中英文字母、空格、数字和其它字符的个数
 * 作者：
 * 日期：2023/12/1 21:55
 */
public class Counter {
    public static void main(String[] args) {
        //i am a student 123^_^
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();     // 读取一行
        func1(s);
    }

    /*
        方法一 ： 根据ASCII码大小比较
        根据数字0-9 和字母 a-z 和 A-Z 在ASCII码表中连续的特性
     */
    private static void func(String s) {
        int letter = 0, digit = 0, space = 0, others = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') letter++;
            else if ('0' <= c && c <= '9') digit++;
            else if (c==' ') space++;
            else others++;
        }
        System.out.println("letter:"+letter);
        System.out.println("digit:"+digit);
        System.out.println("space:"+space);
        System.out.println("others:"+others);
    }

    /*
        API调用法
        根据Character自带的方法进行判断
     */

    private static void func1(String s) {
        int letter = 0, digit = 0, space = 0, others = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) letter++;
            else if (Character.isDigit(c)) digit++;
            else if(Character.isSpaceChar(c)) space++;
            else others++;
        }
        System.out.println("letter:"+letter);
        System.out.println("digit:"+digit);
        System.out.println("space:"+space);
        System.out.println("others:"+others);
    }


}
