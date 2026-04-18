class Solution {
    public boolean checkPerfectNumber(int num) {
        int t=num,sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(t==sum)
        {
            return true;
        }
        return false;
    }
}