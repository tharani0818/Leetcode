class Solution {
    public boolean isAnagram(String s, String t) 
    {     
    int l1=s.length();
    int l2=t.length();
    int []c=new int[26];
    for(int i:s.toCharArray())
    {
        c[i-'a']++;
    }
     for(int i:t.toCharArray())
    {
        c[i-'a']--;
    }
    if(l1!=l2)
    {return false;}
    for(int i=0;i<26;i++)
    {
        if(c[i]!=0)
          {return false;}
    }
    return true;
    }
}