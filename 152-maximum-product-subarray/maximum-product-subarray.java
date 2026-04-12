class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,pre=1,suf=1;
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        for(int i=0;i<n;i++)
        {  
           if(pre==0)
           {
            pre=1;
           }
           pre=pre*nums[i];
           max=Math.max(pre,max);
        }
        for(int i=n-1;i>=0;i--)
        {   
            if(suf==0)
            {
                suf=1;
            }
            suf=suf*nums[i];
            max=Math.max(suf,max);
        }
        return max;
    }
        
}