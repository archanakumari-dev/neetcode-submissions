class Solution {
    public int majorityElement(int[] nums) {
        int majEle=0;
        int freq=0;

        for(int i=0;i<nums.length;i++){
            if(freq==0){
                freq=1;
                majEle=nums[i];
            }
            else if(nums[i]==majEle) freq++;
            else{
                freq--;
            }
        }

        return majEle;
    }
}