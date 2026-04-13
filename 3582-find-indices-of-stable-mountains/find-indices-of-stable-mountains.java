class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int l=height.length;
        List<Integer>a=new ArrayList<>();
        for(int i=1;i<l;i++)
        {
            if(height[i-1]>threshold)
            {
                a.add(i);
            }
        }
        return a;
    }
}