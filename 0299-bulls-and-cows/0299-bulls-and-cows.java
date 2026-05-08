class Solution {
    public String getHint(String s, String g) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int cow =0, bull =0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            char b = g.charAt(i);
            if(c==b)
                bull++;
            else{
                mp.put(c, mp.getOrDefault(c,0)+1);
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char b = g.charAt(i);
            if(c!=b && mp.containsKey(b) && mp.get(b)>0){
                cow++;
                mp.put(b, mp.get(b)-1);
            }
        }
        return bull +"A"+cow+"B";
    }
}