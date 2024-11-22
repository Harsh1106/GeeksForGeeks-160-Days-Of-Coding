public class StockBuyandSellMaxOneTransactionAllowed {
    public static int maximumProfit(int prices[]) {
        if(prices.length == 1) return 0;
        int profit = 0, buy = prices[0];
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < buy) buy = prices[i];
            else profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(arr));
    }
}
