class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        Arrays.sort(strs);
        char[]l=strs[0].toCharArray();
        char[]r=strs[strs.length-1].toCharArray();
        for(int i=0;i<l.length;i++)
        {
            if(l[i]!=r[i])
            {
                break;
            }
            s.append(l[i]);
        }
        return s.toString();
    }
}