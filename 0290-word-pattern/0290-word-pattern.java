class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] word = s.split(" ");
        if(pattern.length()!=word.length)
            return false;
        HashMap<Character, String> mp = new HashMap<>();
        HashMap<String, Character> mp1 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String w = word[i];
            if(mp.containsKey(c)){
                if(!mp.get(c).equals(w))
                    return false;
            }
            else{
                mp.put(c,w);
            }
            if(mp1.containsKey(w)){
                if(mp1.get(w)!=c)
                    return false;
            }
            else{
                mp1.put(w,c);
            }
        }
        return true;

    }
}