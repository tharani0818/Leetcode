class Solution {
    public int maxProfit(int[] prices) {
        int c=prices[0],max=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>c)
            {
                max+=prices[i]-c;
            }
            c=prices[i];
        }
        return max;
    }
}