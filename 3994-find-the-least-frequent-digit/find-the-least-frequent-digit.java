class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = String.valueOf(n).length();
        int[] arr = new int[length];

        // Step 1: Extract digits
        for (int i = 0; i < length; i++) 
        {
            int digit = n % 10;
            arr[i] = digit;
            n = n / 10;
        }

        // Step 2: Store digit frequencies
        for (int i = 0; i < length; i++) 
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 3: Find digit with minimum frequency
        int minFreq = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count < minFreq) {
                minFreq = count;
                result = num;
            }
            else if (count == minFreq && num < result) 
            {
                result = num;
            }
        }

        // Step 4: Return result
        return result;
    }
}