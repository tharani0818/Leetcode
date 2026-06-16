class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,c=0;
        int[]a=new int[n];
        a[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            a[i]=a[i-1]+nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                c=c+1;
            }
            for(int j=0;j<i;j++)
            {
                if(a[i]-a[j]==k)
                {
                    c=c+1;
                }
            }
        }
        return c;
    }
}