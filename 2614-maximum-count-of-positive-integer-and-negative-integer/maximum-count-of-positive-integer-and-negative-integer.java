class Solution {
    public int maximumCount(int[] nums) {
        int l=0,r=0;int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                l=l+1;
            }
            if(nums[i]<0)
            {
                r=r+1;
            }
        }
        if(l>=r)
        {
            return l;
        }
        else
        {
            return r;
        }
    }
}