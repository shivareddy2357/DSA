class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int sum=0, i=1, step=0;
        while(sum<target){
            sum+=i;
            step++;
            i++;
        }
        while((sum-target)%2!=0){
            sum+=i;
            i++;
            step++;
        }
        return step;
    }
}