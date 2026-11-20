class Solution {
    private void quickSort(int low, int high, int[]nums){
        if(low>=high) return;
        int pivotInd=low;
        int pivot=nums[pivotInd];

        int i=low,j=high;
        while(i<j){
            while(i<high && nums[i]<=pivot){
                i++;
            }

            while(low<j && nums[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            
        }

         int temp=nums[j];
         nums[j]=nums[pivotInd];
         nums[pivotInd]=temp;

        quickSort(low,j-1,nums);
        quickSort(j+1,high,nums);

    }
    public int[] sortArray(int[] nums) {
        quickSort(0,nums.length-1,nums);
        return nums;
    }

}