import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem7TopKFrequentElement {
    public static int[] topKFrequent(int[] nums,int k ){
        if(nums.length == k){
            return nums;
        }

        Map<Integer, Integer> frequencyMap = new java.util.HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }   

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> frequencyMap.get(a) - frequencyMap.get(b)
        );
        for (int key : frequencyMap.keySet()) {
            heap.offer(key);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arrs = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(java.util.Arrays.toString(topKFrequent(arrs,k)));
    }
}
