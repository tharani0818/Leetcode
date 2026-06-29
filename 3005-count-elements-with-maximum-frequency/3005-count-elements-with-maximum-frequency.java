class Solution {
    public int maxFrequencyElements(int[] nums) {
        int m=0;
        int[] f=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            f[nums[i]]++;
        }
        for(int i=0;i<f.length;i++)
        {
            if(f[i]>m)
            {
                m=f[i];
            }
        }
        int c=0;
        for(int i=0;i<f.length;i++)
        {
            if(f[i]==m)
            {
                c=c+f[i];
            }
        }
        return c;
    }
}