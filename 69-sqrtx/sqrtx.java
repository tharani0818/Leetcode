class Solution {
    public int mySqrt(int x) {
        int c=0;
        if(x==0)
        {
            return 0;
        }
        long i=1;
        while(i*i<=x)
        {
            i++;
        }
        return (int)i-1;
    }
}