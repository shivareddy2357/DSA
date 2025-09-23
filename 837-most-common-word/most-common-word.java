class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W+");
        Map<String, Integer> map = new HashMap<>(words.length);
        Set<String> bannedSet = new HashSet<>(banned.length);
        
        String mostCommonWord= "";
        int maxCount = 0;

        for (String b : banned) {
            bannedSet.add(b);
        }

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                int count = map.getOrDefault(word, 0) + 1;
                map.put(word, count);
                if (count > maxCount) {
                    maxCount = count;
                    mostCommonWord = word;
                }
            }
        }

        return mostCommonWord;
    }
}