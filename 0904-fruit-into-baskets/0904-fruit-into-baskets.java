class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int left=0,right=0,max=0;
        for(right=0;right<fruits.length;right++)
        {
            m.put(fruits[right],m.getOrDefault(fruits[right],0)+1);
            while(m.size()>2)
            {
                int current=m.get(fruits[left]);
                if(current==1)
                {
                    m.remove(fruits[left]);
                }
                else
                {
                    m.put(fruits[left],current-1);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}