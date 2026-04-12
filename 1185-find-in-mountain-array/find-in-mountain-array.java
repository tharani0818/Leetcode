/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int l = 0, r = n - 1;
        
        while (l < r) 
        {
            int mid = (l + r) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1))
            {
                l = mid + 1;
            }
            else 
            {
                r = mid;
            }
        }
        int peak = l;

        int find = binarySearch(mountainArr, target, 0, peak, true);
        if (find != -1) return find;
        
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }
    
    private int binarySearch(MountainArray a, int t, int l, int r, boolean asc) 
    {
        while (l <= r) 
        {
            int mid = (l + r) / 2;
            int m = a.get(mid);
            if (m == t) 
            {
                return mid;
            }
            if (asc) 
            {
                if (m < t) l = mid + 1;
                else r = mid - 1;
            } 
            else 
            {
                if (m < t) r = mid - 1;
                else l = mid + 1;
            }
        }
        return -1;
    }
}