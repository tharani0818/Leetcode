class Solution {
    public int maxVowels(String s, int k) {
        int l=s.length();
        int c=0,max=0;
        for(int i=0;i<k;i++)
        {
            char a=s.charAt(i);
            if(a=='A' || a=='a' || a=='e' || a=='E' || a=='I' || a=='i' || a=='O' || a=='o' || a=='u' || a=='U')
            {
                c=c+1;
            }
        }
        max=c;
        for(int i=k;i<l;i++)
        {
            int w=i-k;
            char q=s.charAt(w);
            if(q=='A' || q=='a' || q=='e' || q=='E' || q=='I' || q=='i' || q=='O' || q=='o' || q=='u' || q=='U')
            {
                c=c-1;
            }
            char r=s.charAt(i);
            if(r=='A' || r=='a' || r=='e' || r=='E' || r=='I' || r=='i' || r=='O' || r=='o' || r=='u' || r=='U')
            {
                c=c+1;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}