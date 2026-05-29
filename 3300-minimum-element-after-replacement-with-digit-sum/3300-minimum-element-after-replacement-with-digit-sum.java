class Solution {
    public int minElement(int[] nums) {
        int r=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {   int s=0;
            int rem=0,temp=0;
            while(nums[i]!=0)
            {
                temp=nums[i]%10;
                s=s+temp;
                nums[i]=nums[i]/10;
            }
            r=Math.min(r,s);
        }
        return r;
    }
}