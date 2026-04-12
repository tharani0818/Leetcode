class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int c=0,a;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a=c+nums[i];
            if(a<nums[i])
            {
                c=nums[i];
            }
            else
            {
                c=a;
            }
            if(max<c)
            {
                max=c;
            }
        }
        return max;
    }
}