class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        String a="";
        for(int i=0;i<n;i++)
        {
            if(nums[i].charAt(i)=='0')
            {
                char c='1';
                a=a+c;
            }
            else
            {
                char c='0';
                a=a+c;
            }
        }
        return a.toString();
    }
}