class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int n1=s.length();
        int max=0,l=-1;
        for(int i=0;i<n1;i++)
        {
            if(s.charAt(i)=='1')
            {
                if(l!=-1)
                {
                    max=Math.max(max,i-l);
                }
                l=i;
            }
        }
        return max;
    }
}