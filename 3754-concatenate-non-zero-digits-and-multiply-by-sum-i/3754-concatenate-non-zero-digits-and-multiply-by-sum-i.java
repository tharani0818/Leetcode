class Solution {
    public long sumAndMultiply(int n) {
        int s=0,o=n;
        int r=0;
        StringBuilder a=new StringBuilder();
        while(o!=0)
        {
            int d=o%10;
            if(d!=0)
            {
                s=s+d;
                a.append(d);
            }
            o=o/10;
        }
        if(a.length()==0)
        {
            return 0;
        }
        a.reverse();
        long c=Long.parseLong(a.toString());
        return c*s;
    }
}