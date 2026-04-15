class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>a=new HashSet<>();
        HashSet<Integer>b=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            b.add(nums2[i]);
        }
        ArrayList<Integer>l=new ArrayList<>();
        for(int x:a)
        {
            if(b.contains(x))
            {
                l.add(x);
            }
        }
        int []c=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            c[i]=l.get(i);
        }
        return c;
    }
}