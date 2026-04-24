class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos1 = 0;
        int pos2 = 0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L' || moves.charAt(i) == '_')
            {
                pos1--;
            }
            else
            {
                pos1++;
            }
        }
        
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='R' || moves.charAt(i) == '_')
            {
                pos2++;
            }
            else
            {
                pos2--;
            }
        }
        return Math.max(Math.abs(pos1),Math.abs(pos2));
    }
}