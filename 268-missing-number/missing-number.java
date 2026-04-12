class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+nums[i];
        }
        int a=n*(n+1)/2;
        int b=a-total;
        return b;
    }
}