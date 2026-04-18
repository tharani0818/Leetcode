class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
        {
            return false;
        }
        int o=x,rem=0;
        while(x!=0)
        {
            int temp=x%10;
            rem=rem*10+temp;
            x=x/10;
        }
        if(rem==o)
        {
            return true;
        }
        return false;
    }
}