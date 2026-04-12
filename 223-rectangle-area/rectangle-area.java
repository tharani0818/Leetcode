class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a=(ax2-ax1)*(ay2-ay1);
        int b=(bx2-bx1)*(by2-by1);
        int l=Math.max(ax1,bx1);
        int r=Math.min(ax2,bx2);
        int t=Math.min(ay2,by2);
        int bo=Math.max(ay1,by1);
        int o=0;
        if(r>l && t>bo)
        {
            o=(r-l)*(t-bo);
        }
        int s=a+b-o;
        return s;
    }
}