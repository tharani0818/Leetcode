class Solution {
    public String reverseWords(String s) {
        String[] w=s.split(" ");
        StringBuilder q=new StringBuilder();
        for(String i:w)
        {
            StringBuilder a=new StringBuilder(i);
            q.append((a.reverse()).append(" "));
        }
return q.toString().trim();
        
    }
}