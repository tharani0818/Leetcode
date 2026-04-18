class Solution {
    public int mirrorDistance(int n) {
        int o=n,rem=0;
        while(n!=0)
        {
            int temp=n%10;
            rem=rem*10+temp;
            n=n/10;
        }
        int result=Math.abs(o-rem);
        return result;
    }
}