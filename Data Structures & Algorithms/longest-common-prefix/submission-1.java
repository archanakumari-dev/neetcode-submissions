class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word=strs[0];

        for(int i=1;i<strs.length;i++){
            String str=strs[i];
            int min=Math.min(str.length(),word.length());

            int j;
            for(j=0;j<min;j++){
                if(word.charAt(j)!=str.charAt(j)){
                    break;
                }
            }
            word=word.substring(0,j);
        }

        return word;
    }
}