class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int maxFreq=0, maxFreqEle=1001;
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        
        //will store (freq,ele)
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            pq.add(new int[]{entry.getValue(),entry.getKey()});
        }


        int[] ans=new int[k];
        int i=0;

        while(!pq.isEmpty() && i<k){
            int[] polled=pq.poll();
            ans[i++]=polled[1];
        }

        return ans;
    }
}
