package T2.T8;

/**
 * 功能：
 * 作者：
 * 日期：2023/12/1 21:33
 */
public class PriceSumTest {
    public static void main(String[] args) {
        givePriceSum g = new givePriceSum();
        String s = "欢迎光临美好生活超市,你所买的苹果20.5元，梨20元,铅笔5.8元，香\n" +
                "蕉30.5元，矿泉水20.8元。";
        double priceSum = g.getPriceSum(s);
        System.out.printf("你此次花费的金额为：%.2f元\n",priceSum);
    }
}
