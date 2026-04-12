class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer>m=new LinkedHashMap<>();
        int k=0;
        for(int i:nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> hm : m.entrySet() )
        {
            if(hm.getValue() >= 2)
            {
                nums[k++] = hm.getKey();
                nums[k++] = hm.getKey();
            }
            else
            {
                nums[k++] = hm.getKey();
            }
        }
        return k;
    }
}