class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    row.add(1);
                else{
                    int val = ll.get(i-1).get(j-1) + ll.get(i-1).get(j);
                    row.add(val);
                }
            }
            ll.add(row);
        }
        return ll;
    }
}