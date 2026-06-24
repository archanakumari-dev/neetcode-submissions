class Solution {
    public boolean isAnagram(String s, String t) {
       int n=s.length();
       int m=t.length();

       if(n!=m) return false;

       int[] freq=new int[26];

       for(int i=0;i<n;i++){
         int idx=s.charAt(i)-'a';
         freq[idx]++;
       }

       for(int i=0;i<n;i++){
         int idx=t.charAt(i)-'a';
         freq[idx]--;
       }

       for(int i=0;i<26;i++){
          if(freq[i]!=0) return false;
       }

       return true;
    }
}
