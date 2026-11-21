class Solution {
    public void sortColors(int[] nums) {
        int i=-1,j=0,k=nums.length-1;

        while(j<k){
            if(nums[j]==1) j++;
            if(nums[j]==0){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }else{
                while(j<k && nums[k]==2) k--;
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
            }
        }
    }
}