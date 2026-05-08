class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        if(n<m)
            return "";
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char c: t.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        int left =0, st =0, minlen = Integer.MAX_VALUE;
        for(int right =0;right<n;right++){
            char c = s.charAt(right);
            if(mp.containsKey(c)){
                if(mp.get(c)>0)
                    m--;
                mp.put(c, mp.get(c)-1);  //yha pr us character ki fre
            }
            //abhi tk right/j ko iterate krke dekha kha tk ki frequency t ke equal h 
            // ab left/i ko iterate krke window ko chota krenge jisse minimum length ke window milegi
            while(m==0){
                int winlen = right-left+1; // window length
                if(winlen<minlen){
                    minlen = winlen;
                    st = left;
                }
                // yha se left/i iterate ho rha h aur first value milte hi i ruk jayega aur next window mill jayega
                // window means -> ADOBEC , ->BECDEBA, ->CDEBA, ->BANC ye 4 me BANC minimum length ki h 
                // isme first i=A and J=C hoga, next me i=B & j=A and so on.
                char ch = s.charAt(left);
                if(mp.containsKey(ch)){
                    mp.put(ch, mp.get(ch)+1);
                    if(mp.get(ch)>0)
                        m++;
                }
                left++;
            }
        }
        return (minlen == Integer.MAX_VALUE) ? "" : s.substring(st, st+minlen);
    }
}