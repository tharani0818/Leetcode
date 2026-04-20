class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        
        int d1=0,d2=0;

        for (int i=n-1;i>=0;i--)
        {
            if (colors[i]!=colors[0]) 
            {
                d1=i;  
                break;
            }
        }

        for (int i=0;i<n;i++) 
        {
            if (colors[i]!=colors[n-1]) 
            {
                d2=(n-1)-i;
                break;
            }
        }

        return Math.max(d1,d2);
    }
}