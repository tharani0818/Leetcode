class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer>m=new HashMap<>();
        int c=1;
        for(int i=0;i<n;i++)
        {
            if(!m.containsKey(arr[i]))
            {
                m.put(arr[i],c);
                c++;
            }
        }
        int[]b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=m.get(a[i]);
        }
        return b;
    }
}