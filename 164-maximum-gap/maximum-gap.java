class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int a=nums[i+1]-nums[i];
            if(c<a)
            {
                c=a;
            }
        }
        return c;
    }
}