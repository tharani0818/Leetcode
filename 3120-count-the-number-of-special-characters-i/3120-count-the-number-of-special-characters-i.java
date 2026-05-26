class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] a=new boolean[26];
        boolean[] b=new boolean[26];
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c))
            {
                a[c-'a']=true;
            }
            else
            {
                b[c-'A']=true;
            }
        }
        int r=0;
        for(int i=0;i<26;i++)
        {
            if(a[i]&&b[i])
            {
                r++;
            }
        }
        return r;
    }
}