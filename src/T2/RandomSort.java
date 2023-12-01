package T2;

import java.util.Arrays;
import java.util.Random;

/**
 * 功能：产生10个1-100之间的随机整数输出，并把这10个数按从小到大的顺序输出
 * 作者：
 * 日期：2023/12/1 17:40
 */
public class RandomSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[]arr = new int[10];
        for(int i = 0;i<10;i++) {
            arr[i] = r.nextInt(1,100+1);
        }
        System.out.println("随机10个随机整数：");
        System.out.println(Arrays.toString(arr));
        API(arr);
        System.out.println("排序后的结果：");
        System.out.println(Arrays.toString(arr));

    }

    /*
        API 调用法  时间复杂度  O( nlog(n) )
     */
    private static void API(int[]arr) {
        Arrays.sort(arr);
    }





    /*
        快速排序 时间复杂度  O( nlog(n) )
     */

    public static void quicklySort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    public static void process(int[] arr, int L, int R) {
        if (L >= R) return;
        // 等于区(已经在自己位置上的数的左右边界)
        int[] equalE = partition(arr, L, R);
        process(arr, L, equalE[0] - 1);
        process(arr, equalE[1] + 1, R);
    }

    public static int[] partition(int[] arr, int L, int R) {
        // 在arr[L,R] 范围上，拿arr[R]做划分值
        int lessR = L - 1;
        int mostL = R;
        int index = L;
        while (index < mostL) {
            if (arr[index] < arr[R]) {
                swap(arr, ++lessR, index++);
            } else if (arr[index] > arr[R]) {
                swap(arr, --mostL, index);
            } else {
                index++;
            }
        }
        swap(arr, R, mostL);
        return new int[]{lessR + 1, mostL};
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




}
