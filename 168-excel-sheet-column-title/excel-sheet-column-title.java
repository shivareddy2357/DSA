class Solution {
    public String convertToTitle(int col) {
        StringBuilder res=new StringBuilder();

        while(col>0){
            col--;
            int rem=col%26;
            char curr=(char)(rem+'A');
            res.append(curr);
            col/=26;
        }
        return res.reverse().toString();
    }
}