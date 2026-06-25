class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int maxFreq=0, maxFreqEle=1001;
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        
        //will store (ele,freq)
        int[][] arr=new int[freq.size()][2];
        int i=0;

        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            arr[i][0]=entry.getKey();
            arr[i][1]=entry.getValue();
            i++;
        }

        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));

        int[] ans=new int[k];
         i=0;

        while(i<k && i<arr.length){
            ans[i]=arr[i][0];
            i++;
        }

        return ans;
    }
}
