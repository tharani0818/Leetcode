class Solution {
    public int reverseBits(int n) {
        String a=Integer.toBinaryString(n);
        a=String.format("%32s",a).replace(' ','0');
        String s="";
        for(int i=a.length()-1;i>=0;i--)
        {
            s=s+a.charAt(i);
        }
        int c=Integer.parseInt(s,2);
        return c;
    }
}