class Solution {
    public String reverseWords(String s) {
        String[] a=s.split("\\s+");
        int l=a.length;
        StringBuilder b=new StringBuilder();
        for(int i=l-1;i>=0;i--)
        {
          b.append(a[i]);
          if(i!=0)
          {
            b.append(" ");
          }
        }
        return b.toString().trim();

    }
}