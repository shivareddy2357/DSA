class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n= arr.length, x=queries.length;
        int[] b = new int[x];
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1]^arr[i];
        }
        for(int i=0; i<x; i++){
            if(queries[i][0]>0){
                b[i] = arr[queries[i][1]]^arr[queries[i][0]-1];
            } else{
                b[i] = arr[queries[i][1]];
            }
        }
        return b;
    }
}