class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int o=n;
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(baskets[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<a.size();j++)
            {
                if(fruits[i]<=a.get(j))
                {
                    a.remove(j);
                    o--;
                    break;
                }
            }
        }
        return o;
    }
}