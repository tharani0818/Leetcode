class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String>a=new ArrayList<>();
        if(nums.length==0)
        {
            return a;
        }
        int c=nums[0];
        for(int i=1;i<=nums.length;i++)
        {
            if(i==nums.length|| nums[i]!=nums[i-1]+1)
            {
                if(c==nums[i-1])
                {
                    a.add(String.valueOf(c));
                }
                else
                {
                    a.add(c+"->"+nums[i-1]);
                }
                if(i<nums.length)
                {
                    c=nums[i];
                }
            }
        }
           return a;
        }
}