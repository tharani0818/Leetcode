class Solution {
    int rev(int n)
    {
        int t=n,r=0;
        while(t!=0)
        {
            int d=t%10;
            r=r*10+d;
            t=t/10;
        }
        return r;
    }
    public boolean isSameAfterReversals(int num) {
        int a=rev(num);
        int b=rev(a);
        if(num==b)
        {
            return true;
        }
        return false;
    }
}