class KthLargest {
    
    PriorityQueue<Integer> q = new PriorityQueue<>(); // Space-:O(K)
    int k;

    public KthLargest(int k, int[] nums) {

        this.k=k;
        for(int i:nums){
            q.offer(i);
        }
        while(q.size()>k) q.poll();
    }
    
    public int add(int val) {
        
        // System.out.println(q);
        q.add(val);
        while(q.size()>k)
        q.poll();
        // System.out.println(q);
        return q.peek();
        
    }
}

