class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>r=new ArrayList<>();
        int a=0;
        for (int i:nums) 
        {
            a=(a* 2+i)%5;
            r.add(a==0);
        }

        return r;
    }
}