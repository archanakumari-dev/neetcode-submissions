class Solution {
    private boolean check(int id,int num,HashMap<Integer,HashSet<Integer>> cube){
        HashSet<Integer> set=cube.getOrDefault(id,new HashSet<>());
        if(set.contains(num)) return false;
        set.add(num);
        cube.put(id,set);
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        
       HashMap<Integer,HashSet<Integer>> map=new HashMap<>(); //for3*3
       HashMap<Integer,HashSet<Integer>> rowMap=new HashMap<>();
       HashMap<Integer,HashSet<Integer>> colMap=new HashMap<>();

       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]=='.') continue;
            int num=board[i][j]-'0';

            if(!check(i,num,rowMap)) return false;
            if(!check(j,num,colMap)) return false;

            
            if(i<3){
                if((j<3 && !check(0,num,map)) || (j>=3 && j<6 && !check(1,num,map)) ||(j>=6 && j<9 && !check(2,num,map))){
                   return false;
                }
            }else if(i>=3 && i<6){
                if((j<3 && !check(3,num,map)) || (j>=3 && j<6 && !check(4,num,map)) ||(j>=6 && j<9 && !check(5,num,map))){
                   return false;
                }
            }else{
                if((j<3 && !check(6,num,map)) || (j>=3 && j<6 && !check(7,num,map)) ||(j>=6 && j<9 && !check(8,num,map))){
                   return false;
                }
            }
        }
       }

       

       return true;

    }
}
