class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int s=nums[i]+nums[i+1];
            if(h.contains(s))
            {
                return true;
            }
            h.add(s);
        }
        return false;
    }
}