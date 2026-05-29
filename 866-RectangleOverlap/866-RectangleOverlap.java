// Last updated: 30/05/2026, 00:04:31
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3];

        int p1=rec2[0];
        int q1=rec2[1];
        int p2=rec2[2];
        int q2=rec2[3];

        if(x2<=p1 || x1>=p2 || y2<=q1 || y1>=q2)
            return false;
        return true;
    }
}