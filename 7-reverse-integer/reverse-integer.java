class Solution {
    public int reverse(int x) {
        int a=0,b=x,c=0;
        if(x<0)
        {
            x=-x;
        }
        while(x>0)
        {
          if(a>Integer.MAX_VALUE/10)
          {
            return 0;
          }
          a=a*10;
          a=a+x%10;
          x=x/10;
          c=c+1;
        }
        if(b<0)
        {
            a=-a;
        }
        return a;
    }
}