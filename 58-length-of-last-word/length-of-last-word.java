class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] w=s.split(" ");
        int l=w.length;
        int l1=w[l-1].length();
        return l1;
    }
}