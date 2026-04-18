class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t=0,s=0,c=0;
        for(int i=0;i<gas.length;i++)
        {
            int d=gas[i]-cost[i];
            t=t+d;
            c=c+d;
            if(c<0)
            {
                s=i+1;
                c=0;
            }
        }
        return(t>=0)? s:-1;
    }
}