class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> col= new HashMap<>();
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<String, Set<Character>> sq = new HashMap<>();


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char num=board[i][j];

                if(num=='.') continue;

                if(!row.containsKey(i)) row.put(i,new HashSet<>());
                if(!col.containsKey(j)) col.put(j,new HashSet<>());
                if(!sq.containsKey(i/3+","+j/3)) sq.put(i/3+","+j/3,new HashSet<>());

                if(row.get(i).contains(num)  
                       || sq.get(i/3+","+j/3).contains(num)
                       || col.get(j).contains(num)
                 ) return false;

                 row.get(i).add(num);
                 col.get(j).add(num);
                 sq.get(i/3+","+j/3).add(num);
                
            }
        }

        return true;
    }
}
