class MyHashMap {
    class Node{
        int key;
        int val;
        Node next;

        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    Node[] map=new Node[1000];
    public MyHashMap() {
        for(int i=0;i<map.length;i++){
            map[i]=new Node(0,0);
        }
    }
    
    public void put(int key, int value) {
         Node bucket=map[key%map.length];

         while(bucket.next!=null){
            if(bucket.next.key==key){
                bucket.next.val=value;
                return;
            }
            bucket=bucket.next;
         }

         bucket.next=new Node(key,value);

    }
    
    public int get(int key) {
        Node bucket=map[key%map.length];

        while(bucket.next!=null){
            if(bucket.next.key==key) return bucket.next.val;
            bucket=bucket.next;
        }

        return -1;
    }
    
    public void remove(int key) {
         Node bucket=map[key%map.length];

        while(bucket.next!=null){
            if(bucket.next.key==key){
                bucket.next=bucket.next.next;
                return;
            }
            bucket=bucket.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */