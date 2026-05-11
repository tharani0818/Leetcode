class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer>a=new ArrayList<>();
        int rem=0;
        while(n>0)
        {
            int temp=n%10;
            rem=rem*10+temp;
            n=n/10;
        }
        while(rem>0)
        {
            int temp=rem%10;
            a.add(temp);
            rem=rem/10;
        }
    int[]r=new int[a.size()];
    for(int i=0;i<a.size();i++)
    {
        r[i]=a.get(i);
    }
    int o=0,e=0;
    for(int i=0;i<r.length;i++)
    {
        if(i%2==0)
        {
            o=o+r[i];
        }
        else
        {
            e=e+r[i];
        }
    }
    int c=o-e;
    return c;
        }
}