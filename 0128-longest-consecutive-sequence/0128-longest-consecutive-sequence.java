class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
        {
            return 0;
        }
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int c=1,m=1;
        ArrayList<Integer>a=new ArrayList<>(s);
        Collections.sort(a);
        for(int i=1;i<a.size();i++)
        {
            if(a.get(i)==a.get(i-1)+1)
            {
                c=c+1;
            }
            else
            {
                c=1;
            }
            m=Math.max(m,c);
        }
        return m;
    }
}