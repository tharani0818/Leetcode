class Solution {
    public String largestNumber(int[] nums) {
        String[] a=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i]+"";
        }
        Arrays.sort(a,(s1,s2)->(s1+s2).compareTo(s2+s1));
        if(a[a.length-1].equals("0"))
        {
            return "0";
        }
        StringBuilder b=new StringBuilder();
        for(int i=nums.length-1;i>=0;i--)
        {
            b.append(a[i]);
        }
        return b.toString();
    }
}