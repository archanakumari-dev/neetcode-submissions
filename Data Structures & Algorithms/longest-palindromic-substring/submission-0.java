class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();

        boolean[][] dp=new boolean[n][n];

        for(int len=1;len<=n;len++){
            for(int i=0;i<n;i++){
                int j=i+len-1;
                if(j>=n) continue;

                if(len==1){
                    dp[i][j]=true;
                }else if(len==2){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }else{
                    dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                }
            }
        }
        int resultLen=0,k=0,l=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j] && resultLen<j-i+1){
                    resultLen=j-i+1;
                    k=i;
                    l=j;
                }
            }
        }

        return s.substring(k,l+1);
    }
}
