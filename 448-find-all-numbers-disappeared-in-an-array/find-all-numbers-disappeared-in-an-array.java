class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        Set<Integer>s=new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(nums[i]);
        }
        for(int i=1;i<=n;i++)
        {
           if(!s.contains(i))
           {
            l.add(i);
           }
        }
        return l;
    }
}