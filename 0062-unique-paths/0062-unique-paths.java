class Solution {
    public int uniquePaths(int m, int n) {
      int[]a=new int[m];
      for(int i=0;i<m;i++)
      {
        a[i]=1;
      }  
      for(int i=1;i<n;i++)
      {
        for(int j=1;j<m;j++)
        {
            a[j]=a[j]+a[j-1];
        }
      }
      return a[m-1];
    }
}