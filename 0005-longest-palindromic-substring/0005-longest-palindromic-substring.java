class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String lp=s.substring(0,1);
        for(int i=1;i<n;i++)
        {
            int low=i,high=i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
            }
            String pal=s.substring(low+1,high);
            if(pal.length()>lp.length())
            {
                lp=pal;
            }
        }
         for(int i=1;i<n;i++)
        {
            int low=i-1,high=i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
            }
            String pal=s.substring(low+1,high);
            if(pal.length()>lp.length())
            {
                lp=pal;
            }
        }
        return lp;
    }
}