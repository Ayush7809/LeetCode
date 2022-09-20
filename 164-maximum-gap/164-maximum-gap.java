class Solution {
    public int maximumGap(int[] nums) {
       int n= nums.length;
        if(n<2){
            return 0;
        }
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(nums[i]);
        }
       
        ArrayList<Integer> br = new ArrayList<>(ar);
        int m=0;
        int l= br.size();
        Collections.sort(br); 
        if(l<2){
            return 0;
        }
       
        for(int i=1;i<l;i++){
            int d=br.get(i)-br.get(i-1);
            if(d>m)
                m=d;
               //System.out.print(m);
        }
        
        return m;
    }
}