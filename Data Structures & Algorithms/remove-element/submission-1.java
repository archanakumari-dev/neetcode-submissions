class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0, j=n-1;

        while(i<=j){
            while(i<n && nums[i]!=val) i++;
            while(j>=0 && nums[j]==val) j--;

            if(i>j) break;
            //swap 
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        return j+1;
    }
}