class Solution {
    public int averageValue(int[] nums) {
        int r=0,n=0,s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                n=n+1;
                s=s+nums[i];
            }
        }
        if(n==0)
        {
            return 0;
        }
        int c=s/n;
        return c;
    }
}