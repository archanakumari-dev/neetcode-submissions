class Solution {
    int[] dp;
    private int solve(int ind, int[] cost){
        if(ind>=cost.length) return 0;

        if(dp[ind]!=-1) return dp[ind];

        int pickOneStep=cost[ind]+solve(ind+1,cost);
        int pickTwoStep=cost[ind]+solve(ind+2,cost);
        
        return dp[ind]= Math.min(pickTwoStep,pickOneStep);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n+1];

        Arrays.fill(dp,-1);


        return Math.min(solve(0,cost),solve(1,cost));
    }
}
