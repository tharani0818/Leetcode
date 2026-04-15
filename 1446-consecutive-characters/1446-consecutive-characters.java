class Solution {
    public int maxPower(String s) {
        int c=1,max=0,flag=0;
        for(int i=1;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i-1);
            if(a==b)
            {
                c=c+1;
                flag=1;
                if(c>max)
                {
                    max=c;
                }
            }
            else
            {
                c=1;
            }
        }
        if(flag==0)
        {
            return 1;
        }
        return max;
    }
}