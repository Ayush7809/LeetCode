class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> arr = new ArrayList<>();
        arr.add(words[0]);
        int n = words.length;
        for(int i=1;i<n;i++){
            if(!compare(words[i],words[i-1]))
                arr.add(words[i]);
        }
        return arr;
    }
    public boolean compare(String a, String b){
        int [] freq = new int [26];
        for(char c : a.toCharArray())
            freq[c-'a']++;
        for(char c : b.toCharArray())
            freq[c-'a']--;
        for(int x : freq){
            if(x!=0)
                return false;
        }
        return true;
    }
}