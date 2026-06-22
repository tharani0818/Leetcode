class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>>h=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
            sum=nums[i]+nums[l]+nums[r];
            if(sum==0)
            {
                h.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;
            }
            else if(sum>0)
            {
                r--;
            }
            else{
                l++;
            }
            }
        }
        return new ArrayList<>(h);
    }
}