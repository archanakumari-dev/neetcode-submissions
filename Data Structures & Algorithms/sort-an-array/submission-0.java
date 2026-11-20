class Solution {
    private void merge(int low, int mid, int high, int[] nums){
        int[] arr=new int[high-low+1];

        int i=low,k=mid+1;
        int ind=0;
        while(i<=mid && k<=high){
            if(nums[i]<nums[k]){
                arr[ind++]=nums[i];
                i++;
            }else{
                arr[ind++]=nums[k];
                k++;
            }
        }
        while(i<=mid){
            arr[ind++]=nums[i];
            i++;
        }

        while(k<=high) arr[ind++]=nums[k++];

        for(i=0;i<arr.length;i++){
            nums[i+low]=arr[i];
        }
    }
    private void divide(int low, int high,int[] nums){
       if(low>=high) return;
       int mid=low+(high-low)/2;

       divide(low,mid,nums);
       divide(mid+1,high,nums);

       merge(low,mid,high,nums);
    }
    public int[] sortArray(int[] nums) {
        divide(0,nums.length-1,nums);
        return nums;
    }
}