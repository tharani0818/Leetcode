class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int c=0,a=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                c=c+1;
                a=i;
            }
        }
        if(c==1)
        {return a;}
        return -1;

    }
}