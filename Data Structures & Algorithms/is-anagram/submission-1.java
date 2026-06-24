class Solution {
    public boolean isAnagram(String s, String t) {
       int n=s.length();
       int m=t.length();

       if(n!=m) return false;

       int[] freq=new int[26];

       for(int i=0;i<n;i++){
         int idx1=s.charAt(i)-'a';
         int idx2=t.charAt(i)-'a';
         freq[idx1]++;
         freq[idx2]--;
       }

       for(int i=0;i<26;i++){
          if(freq[i]!=0) return false;
       }

       return true;
    }
}
