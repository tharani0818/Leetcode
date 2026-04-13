class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<=n-1;i++)
        {
            if(nums[i]==target)
            {
                l.add(i);
            }
        }
        int ls=l.size();

        if(nums.length==1 && target == 1)
        {
            return new int[]{0,0};
        }
        if(ls==0)
        {  
            return new int[]{-1,-1};
        }
        
            int f=l.get(0);
            int e=l.get(l.size()-1);
            return new int[]{f,e};
    }
}