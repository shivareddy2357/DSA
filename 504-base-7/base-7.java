class Solution {
    public String convertToBase7(int num) {
        if(num == 0)
        {
            return "0";
        }

        boolean negative = true;
        if(num>0)
        {
            negative = false;
        }
        num = Math.abs(num);
        
        StringBuilder sb = new StringBuilder();

        while(num>0)
        {
            sb.append(num % 7);
            num = num/7;
        }

        if(negative)
        {
            sb.append("-");
        }
        return sb.reverse().toString();

    }
}