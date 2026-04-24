class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        StringBuilder[] sb = new StringBuilder[Math.min(numRows, s.length())];
        for(int i=0;i<sb.length;i++){
            sb[i] = new StringBuilder();
        }
        int currRow =0;
        boolean down = false;
        for(char c: s.toCharArray()){
            sb[currRow].append(c);
            if(currRow==0 || currRow == numRows-1)
                down = !down;
            currRow += down ? 1 : -1;

        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder st : sb){
            ans.append(st);
        }
        return ans.toString();
    }
}