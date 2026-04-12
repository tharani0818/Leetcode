class Solution {
    public double myPow(double x, int n) {
        long p=n;
        double a=1;
        if(p<0)
        {
            x=1/x;
            p=-p;
        }
        while(p>0)
        {
            if(p%2==1)
            {
               a=a*x;
            }
            x=x*x;
            p=p/2;
        }
        return a;
    }
}