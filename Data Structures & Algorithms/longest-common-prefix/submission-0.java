class Solution {
    int n;
    class Node{
        char ch;
        int freq=0;
        Node[] children=new Node[26];

        public Node(char ch){
            this.ch=ch;
            Arrays.fill(this.children,null);
        }
    }

    Node root=new Node('a'); //dummy root 

    private void createTrie(String str){

         Node node=root;
         
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(node.children[ch-'a']==null){
                Node newNode=new Node(ch);
                node.children[ch-'a']=newNode;
            }
            node=node.children[ch-'a'];
            
            node.freq++;
         }
    }
    private String countPrefix(String str){
        Node node=root;
        StringBuilder sb=new StringBuilder();
         
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int freq= node.children[ch-'a'].freq;

            if(freq==n){
                sb.append(ch);
                node=node.children[ch-'a'];
            }else{
                break;
            }
         }

         return sb.toString();
          
    }
    public String longestCommonPrefix(String[] strs) {

         n=strs.length;
        String word="";
        
        for(String str:strs){
            
            if(str.length()==0)  return "";
            if(word.length()<str.length()){
                word=str;
            }
            createTrie(str);
        }

        return countPrefix(word);

    }
}