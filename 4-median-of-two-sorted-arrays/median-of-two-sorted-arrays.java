class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int new_array[] = new int[n];
        int pointer1 = 0;
        int pointer2 = 0;
        int count = 0;
        while(pointer1<nums1.length && pointer2<nums2.length){
            if(nums1[pointer1]<nums2[pointer2]){
                new_array[count] = nums1[pointer1];
                pointer1++;
            }else{
                new_array[count] = nums2[pointer2];
                pointer2++;
            }
            count++;
        }
        if(pointer1<nums1.length){
            for(int i=pointer1;i<nums1.length;i++){
                new_array[count++] = nums1[i];
            }
        }
        
        if(pointer2<nums2.length){
            for(int i=pointer2;i<nums2.length;i++){
                new_array[count++] = nums2[i];
            }
        }
        if(n%2!=0){
            return new_array[n/2];
        }
        double answer = (new_array[n/2]+new_array[(n/2)-1])/2.0;
        return answer;
    }
}