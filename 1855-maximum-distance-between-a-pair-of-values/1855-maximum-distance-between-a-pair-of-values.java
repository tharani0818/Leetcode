class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans=0;
        int j=0;
        for (int i=0;i<n;i++)
        {
            while (j<m && nums2[j]>=nums1[i]) 
            {
                j++;
            }
            int jMax=j-1;
            if (jMax>=i) 
            {
                ans=Math.max(ans,jMax-i);
            }
        }
        return ans;
    }
}