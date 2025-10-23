class Solution {
    public boolean hasSameDigits(String s) {
      if(s.length()<2)return false;
        if(s.length()==2){
            //check if both char are =
            return s.charAt(0)==s.charAt(1);
        }
        StringBuilder nstr=new StringBuilder();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            int sum=arr[i]+arr[i+1];
            if(sum>10)nstr.append(sum%10);
            else nstr.append(sum);
        }
        return hasSameDigits(nstr.toString());
    }
}