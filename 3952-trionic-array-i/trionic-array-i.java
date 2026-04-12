class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int i=0,a=0,b=0;
        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
        }a=i;
        if(a==0 || a==n-1)
        {
            return false;
        }
        while(i+1<n && nums[i]>nums[i+1])
        {
            i++;
        }
        b=i;
        if(b==0 || b==n-1)
        {
            return false;
        }
        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
        }
        if(i==n-1)
        {return true;}
        else
        {return false;}
    }
}