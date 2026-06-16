class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]r=new int[n];
        for(int i=0;i<n;i++)
        {
            r[i]=-1;
            for(int j=1;j<n;j++)
            {
                int a=(i+j)%n;
                if(nums[a]>nums[i])
                {
                    r[i]=nums[a];
                    break;
                }
            }
        }
        return r;
    }
}