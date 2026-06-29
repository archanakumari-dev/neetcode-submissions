class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int l=0, r=numbers.length-1;

       while(l<r){
          int num1=numbers[l];
          int num2=numbers[r];
          int sum=num1+num2;

          if(sum<target) l++;
          else if(sum>target) r--;
          else return new int[]{l+1,r+1};
       } 

       return new int[]{};
    }
}
