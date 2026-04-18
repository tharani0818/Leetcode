class Solution {
    public int maxProfit(int[] prices) {
        int c=prices[0],max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<c)
            {
                c=prices[i];
            }
            else if(prices[i]-c>max)
            {
                max=prices[i]-c;
            }
        }
        return max;
    }
}