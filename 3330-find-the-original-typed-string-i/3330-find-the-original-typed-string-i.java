class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int c=1;
        for(int i=1;i<=n-1;i++)
        {
            if(word.charAt(i)==word.charAt(i-1))
            {
                c=c+1;
            }
        }
        return c;
    }
}