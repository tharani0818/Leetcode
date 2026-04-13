class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int l=0,mid=0;
        int r=n-1;
        while(l<r)
        {
            mid=(l+r)/2;
            if(arr[mid]<arr[mid+1])
            {
                l=mid+1;
            }
            else
            {
                r=mid;
            }
        }
        return l;
    }
}