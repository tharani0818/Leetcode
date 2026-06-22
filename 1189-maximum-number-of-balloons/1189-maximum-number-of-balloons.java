class Solution {
    public int maxNumberOfBalloons(String text) {
        int[]a=new int[26];
        int c1=0;
        for(int i=0;i<text.length();i++)
        {
            char c=text.charAt(i);
            a[c-'a']++;
        }
        while(a['b'-'a']>0&& a['a'-'a']>0&& a['l'-'a']>=2&& a['o'-'a']>=2 && a['n'-'a']>0)
        {
            a['b'-'a']--;
            a['a'-'a']--;
            a['l'-'a']-=2;
            a['o'-'a']-=2;
            a['n'-'a']--;
            c1++;
        }
        return c1;
    }
}