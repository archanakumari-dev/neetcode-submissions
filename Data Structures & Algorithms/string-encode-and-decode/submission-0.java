class Solution {
    

    public String encode(List<String> strs) {
       StringBuilder sb=new StringBuilder();

       for(String str:strs){
          sb.append(str.length()).append('#').append(str);
       }
       System.out.println(sb.toString());

       return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> list=new ArrayList<>();
        int n=str.length();
        int i=0;
        
        while(i<n){
            int j=i;

            while(j<n && str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,j+1+len));
            i=j+len+1;
        }

        return list;
    }
}
