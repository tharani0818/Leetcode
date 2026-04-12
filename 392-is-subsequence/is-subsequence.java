class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0,b=0;
        int s1=s.length();
        int t1=t.length();
        while(a<s1 && b<t1)
        {
            char p=s.charAt(a);
            char q=t.charAt(b);
            if(p==q)
            {
                a=a+1;
            }
            b=b+1;
        }
    if(a==s1)
    {
        return true;
    }
    return false;
    }
}