class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int t=0,p=0,c=0;
        for(int i=n-1;i>=0;i--)
        {
            c=fun(s.charAt(i));
            if(c<p)
            {
               t=t-c;
            }
            else
            {
                t=t+c;
            }
            p=c;
        }
        return t;
    }
    int fun(Character c)
    {   
        switch (c) 
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}