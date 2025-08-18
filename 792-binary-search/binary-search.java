class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length, mid=0;
        int start=0, end=n-1;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]== target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}