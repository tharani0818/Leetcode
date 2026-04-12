class Solution {
    public int addDigits(int num) {
     if(num<10)
     {return num;}
     int sum=0,b=0;
     while(num>=10)
     {
        int a=num;
        while(a>0)
        {
            b=a%10;
            sum=sum+b;
            a=a/10;
        }
        num=sum;
        sum=0;
     }   
     return num;
    }
}