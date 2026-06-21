class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            heap.offer(stones[i]);
        }
        while(heap.size() > 1){
            int y = heap.poll();
            int x = heap.poll();
            if(x == y) {
                continue;
            }
            else if(y > x){
                heap.offer(y-x);
            }
        }
        if(heap.size() == 1) {
            return heap.poll();
        }
        return 0;
    }
}
