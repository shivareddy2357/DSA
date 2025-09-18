class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for(String x : wordList){
            set.add(x);
        }
        set.remove(beginWord);
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        while(!q.isEmpty()){
            int steps = q.peek().steps;
            String word = q.peek().word;
            q.remove();
            if(word.equals(endWord)) return steps;
            for(int i = 0; i < word.length(); i++){
                for(char ch = 'a'; ch <= 'z'; ch++){
                    String newString = word.substring(0,i) + ch + word.substring(i+1);
                    if(set.contains(newString)){
                        set.remove(newString);
                        q.offer(new Pair(newString,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}
class Pair{
    int steps;
    String word;
    Pair(String word, int steps){
        this.steps = steps;
        this.word = word;
    }
}