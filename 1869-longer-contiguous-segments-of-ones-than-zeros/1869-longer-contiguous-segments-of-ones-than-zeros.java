class Solution {
    public boolean checkZeroOnes(String s) {
        int o=0,z=0,co=0,cz=0;
        //co-current consecutive 1
        //cz-current consecutive 0
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                co++;
                cz=0;
                if(co>o)
                {
                    o=co;
                }
            }
            if(s.charAt(i)=='0')
            {
                cz++;
                co=0;
                if(cz>z)
                {
                    z=cz;
                }
            }
        }
        if(o<=z)
        {
            return false;
        }
        return true;
    }
}