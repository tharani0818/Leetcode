class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE,sum=0,left=0,right=0;
        while(right<nums.length)
        {
            sum=sum+nums[right];
            right++;
            while(sum>=target)
            {
                int current=right-left;
                min=Math.min(min,current);
                sum=sum-nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return 0;
        }
        return min;
    }
}