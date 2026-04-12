class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[]r=new int [n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            if(nums[i]>=0)
            {
                c=(i+nums[i])%n;
                r[i]=nums[c];
            }
            else
            {
                c=(((i+n+nums[i])%n)+n)%n;
                r[i]=nums[c];
            }
        }
        return r;
   }
}