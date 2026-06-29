class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int m=n/2;
        int c=0,d=0;

        for(int i=0;i<m;i++)
        {
            char a=s.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            {c=c+1;}
        }
        for(int i=m;i<n;i++)
        {
            char a1=s.charAt(i);
            if(a1=='a'||a1=='e'||a1=='i'||a1=='o'||a1=='u'||a1=='A'||a1=='E'||a1=='I'||a1=='O'||a1=='U')
            {d=d+1;}
        }
        if(c==d)
        {
            return true;
        }
        return false;
    }
}