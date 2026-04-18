class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[n-1]*nums[n-2]*nums[n-3];
        int b=nums[n-1]*nums[1]*nums[0];
        return Math.max(a,b);
    }
}