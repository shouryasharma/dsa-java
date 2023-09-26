package arrays;

// leetcode 121. Best Time to Buy and Sell Stock
public class MaxProfit {
    static int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < minPrice)
                minPrice = price;
            int profit = price - minPrice;
            if (profit > maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {};
        int profit = maxProfit(prices);
        System.out.println("Test case 1: Maximum profit: " + profit); // 0

        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // 5

        int[] prices2 = { 7, 6, 5, 4, 3, 2, 1 };
        int profit2 = maxProfit(prices2);
        System.out.println("Test case 2: Maximum profit: " + profit2); // 0

        int[] prices3 = { 1, 2, 3, 4, 5, 6, 7 };
        int profit3 = maxProfit(prices3);
        System.out.println("Test case 3: Maximum profit: " + profit3); // 6

        int[] prices4 = { 3, 2, 6, 5, 0, 3 };
        int profit4 = maxProfit(prices4);
        System.out.println("Test case 4: Maximum profit: " + profit4); // 4

        int[] prices5 = { 2, 4, 1 };
        int profit5 = maxProfit(prices5);
        System.out.println("Test case 5: Maximum profit: " + profit5); // 2
    }
}