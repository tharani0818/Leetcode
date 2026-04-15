class Solution {
    public int hammingDistance(int x, int y) {
        String a=Integer.toBinaryString(x);
        String b=Integer.toBinaryString(y);
        int a1=a.length();
        int b1=b.length();
        int m=Math.max(a1,b1);
        a=String.format("%"+m+"s",a).replace(' ','0');
        b=String.format("%"+m+"s",b).replace(' ','0');
        int c=0;
        for(int i=0;i<m;i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
}