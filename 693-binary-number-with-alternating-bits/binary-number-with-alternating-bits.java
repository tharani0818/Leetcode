class Solution {
    public boolean hasAlternatingBits(int n) {
        String a=Integer.toBinaryString(n);
        int r=a.length();
        for(int i=0;i<r-1;i++)
        {
            if(a.charAt(i)==a.charAt(i+1))
            {
                return false;
            }
        }
        return true;
    }
}