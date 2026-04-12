class Solution {
    public int longestContinuousSubstring(String s) {
        int l=s.length();
        int co=1,max=1;
        if(l==1)
        {
            return 1;
        }
        for(int i=0;i<l-1;i++)
        {
            char c=s.charAt(i);
            char d=s.charAt(i+1);
            if(d-c==1)
            {
                co=co+1;
                if(co>max)
                {
                    max=co;
                }
            }
            else
            {
                co=1;
            }
        }
        return max;
    }
}