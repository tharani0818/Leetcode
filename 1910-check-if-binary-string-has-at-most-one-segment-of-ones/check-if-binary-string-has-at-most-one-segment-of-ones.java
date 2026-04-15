class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0')
            {
                c=c+1;
            }
        
        if(c==1)
        {
            return false;
        }
        }
        return true;
    }
}