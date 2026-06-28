class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int count=0,maxAns=0;

        for(int num:set){
            if(set.contains(num-1)){
                count+=1;
            }else{
                count=1;
            }
             maxAns=Math.max(maxAns,count);
        }

        return maxAns;
    }
}
