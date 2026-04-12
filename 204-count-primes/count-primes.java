class Solution {
    public int countPrimes(int n) {
        if(n<=2)
        {
            return 0;
        }
        int l=(int) Math.sqrt(n);
        boolean[]composite=new boolean[n];
        for(int i=2;i<=l;i++)
        {
            if(composite[i]==false)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    composite[j]=true;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(composite[i]==false)
            {
                c=c+1;
            }
        }
        return c;
    } 
}