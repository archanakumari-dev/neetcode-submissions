class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
           List<Integer> list=map.getOrDefault(nums[i],new ArrayList<>());
           list.add(i);
           map.put(nums[i],list);
        }

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])) continue;
            
            for(int j:map.get(target-nums[i])){
                if(i!=j) return new int[]{Math.min(i,j),Math.max(i,j)};
            }
        }

        return new int[]{-1,-1};
    }
}
