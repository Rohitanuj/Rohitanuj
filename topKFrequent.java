class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm= new HashMap<>();

        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }  

        Queue<Integer> q = new PriorityQueue<>((a,b) -> hm.get(a)-hm.get(b));
        
        for(int n:hm.keySet()){
            q.add(n);
            if(q.size()>k){
                q.poll();
            }
        }
        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=q.poll();
        }
        return ans;
    }
}
