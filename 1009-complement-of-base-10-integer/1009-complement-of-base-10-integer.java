class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String a="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                a=a+'1';
            }
            else
            {
                a=a+'0';
            }
        }
        int b=Integer.parseInt(a,2);
        return b;
    }
}