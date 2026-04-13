class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>l=new ArrayList<>();
        for(int h=0;h<12;h++)
        {
            for(int m=0;m<60;m++)
            {
                int a=Integer.bitCount(h)+Integer.bitCount(m);
                if(a==turnedOn)
                {
                   l.add(h+":"+String.format("%02d",m));
                }
            }
        }
        return l;
    }
}