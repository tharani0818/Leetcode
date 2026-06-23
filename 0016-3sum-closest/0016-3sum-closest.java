class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int rs=nums[0]+nums[1]+nums[2];
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int s=nums[i]+nums[l]+nums[r];
                if(s==target)
                {
                    return target;
                }
                else if(s<target)
                {
                    l++;
                }
                else
                {
                    r--;
                }
                int d=Math.abs(s-target);
                if(d<m)
                {
                    m=d;
                    rs=s;
                }
            }
        }
        return rs;
    }
}