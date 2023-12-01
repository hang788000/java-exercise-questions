package T1;


/**
 * 功能：编写一个Java程序，输出从100-200 之间（包括100和200）的所有素数
 * 作者：
 * 日期：2023/12/1 15:26
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.print("100-200 之间素数有：");
        for(int i=100;i<=200;i++) {
            if (!func(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean func(int n) {
        for (int i=2;i<=(int)Math.pow(n,0.5);i++){
            if (n%i==0) return true;
        }
        return false;
    }
}
