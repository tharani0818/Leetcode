class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int b=nums[i];
            Stack<Integer>st=new Stack<>();
            while(b>0) 
            {
                int digit=b%10;
                st.push(digit);
                b=b/10;
            }
            while(!st.isEmpty()) 
            {
                a.add(st.pop());
            }
        }
        int[]r=new int[a.size()];

        for(int i=0;i<a.size();i++) 
        {
            r[i]=a.get(i);
        }
        return r;
    }
}