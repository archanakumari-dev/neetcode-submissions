class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            String s=strs[i];
            int[] freq=new int[26];

            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
            }
            String key=Arrays.toString(freq);

            List<String> list=map.getOrDefault(key,new ArrayList<>());
            list.add(s);
            map.put(key,list);
        }

        List<List<String>> result=new ArrayList<>();

        for(Map.Entry<String,List<String>> entry:map.entrySet()){
             result.add(entry.getValue());
        }

        return result;
    }
}
