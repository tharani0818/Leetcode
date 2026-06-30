class Solution {
    public int numberOfSubstrings(String s) {
        int c=0,n=s.length();
        int l=0,a=0;
        int[]f=new int[3];
        for(int r=0;r<n;r++)
        {
            f[s.charAt(r)-'a']++;
            while(f[0]>0&&f[1]>0&&f[2]>0)
            {
                a=a+(n-r);
                f[s.charAt(l)-'a']--;
                l++;
            }
        }
        return a;
    }
}