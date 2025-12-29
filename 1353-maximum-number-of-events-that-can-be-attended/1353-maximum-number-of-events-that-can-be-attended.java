class Solution {
    public int maxEvents(int[][] arr){
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count =0;
        int day = 1;
        int i =0;
        while(i<arr.length  || !pq.isEmpty()){
            // add all for current day
            while(i<arr.length && arr[i][0] <=day){
                pq.offer(arr[i][1]);
                i++;
            }
            // remove expired
            while(!pq.isEmpty() && pq.peek()<day){
                pq.poll();
            }
            if(!pq.isEmpty()){
                pq.poll();
                count++;
            }
            day++;
        }
        return count;
    }
}