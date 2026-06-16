class NumArray {
    private int[]a;
    public NumArray(int[] nums) {
        int n=nums.length;
        a=new int[n+1];
        a[0]=0;
        for(int i=0;i<n;i++)
        {
            a[i+1]=nums[i]+a[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return a[right+1]-a[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */