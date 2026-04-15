class Solution {
    public boolean isHappy(int n) {
        int temp=0;
        while(n!=1 && n!=4)
        { int s=0;
          while(n>0)
          {  
           temp=n%10;
           s=s+(temp*temp);
           n=n/10;
          }
          n=s;
        }
        if(n==1)
        {
            return true;
        }
        return false;
}
}