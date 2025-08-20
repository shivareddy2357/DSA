class Solution {
    public int reachNumber(int target) {
        int sum =0 ,steps = 0;
        int a = target;
        if(a ==0){
             return 0;
        }
        a = Math.abs(a);
        while(sum< a){
            sum+=steps;
            steps++;
        }
        
        while(((sum-a)%2!=0)){
            sum+=steps;
            steps++;
        }
        return steps-1;

    }
}