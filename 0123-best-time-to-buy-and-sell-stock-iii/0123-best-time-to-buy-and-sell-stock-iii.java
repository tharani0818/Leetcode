class Solution {
    public int maxProfit(int[] prices) {
        int b1=-prices[0],b2=-prices[0];
        int s1=0,s2=0;
        for(int i=1;i<prices.length;i++)
        {
            int p=prices[i];
            b1=Math.max(b1,-p);
            s1=Math.max(s1,b1+p);
            b2=Math.max(b2,s1-p);
            s2=Math.max(s2,b2+p);
        }
        return s2;
    }
}