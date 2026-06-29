class Solution {
    private boolean isValid(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;

        while(l<r){
           char ch1=s.charAt(l);
           char ch2=s.charAt(r);

           if(!isValid(ch1)){
                l++;
                continue;
           }
           if(!isValid(ch2)){
                r--;
                continue;
           }

           if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)) return false;
           l++;
           r--;
        }

        return true;
    }
}
