class Solution {
    public int[] leftRightDifference(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        int c=0,d=0,q=0;
        a.add(c);
        b.add(d);
        for(int i=0;i<nums.length;i++)
        {
            c=c+nums[i];
            a.add(c);
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            d=d+nums[i];
            b.add(d);
        }
        int[]r=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            r[i]=Math.abs(a.get(i)-b.get(nums.length-i-1));
        }
        return r;
    }
}