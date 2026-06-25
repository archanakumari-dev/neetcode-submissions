class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            String s=strs[i];
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String sortedString=new String(chars);

            List<String> list=map.getOrDefault(sortedString,new ArrayList<>());
            list.add(s);
            map.put(sortedString,list);
        }

        List<List<String>> result=new ArrayList<>();

        for(Map.Entry<String,List<String>> entry:map.entrySet()){
             result.add(entry.getValue());
        }

        return result;
    }
}
