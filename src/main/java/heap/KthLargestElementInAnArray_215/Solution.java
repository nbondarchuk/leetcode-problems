package heap.KthLargestElementInAnArray_215;

class Solution {

    public int findKthLargest(int[] nums, int k) {
        MaxPQ pq = new MaxPQ(nums.length);
        for (int num: nums) {
            pq.insert(num);
        }

        int max = 0;
        for (int i = 0; i < k; i++) {
            max = pq.delMax();
        }
        return max;
    }

    private static class MaxPQ {

        private int[] pq;

        private int n = 0;

        public MaxPQ(int maxN) {
            pq = new int[maxN + 1];
        }

        public int delMax() {
            int max = pq[1];
            exch(1, n--);
            pq[n+1] = 0;
            sink(1);
            return max;
        }

        public void insert(int key) {
            pq[++n] = key;
            swim(n);
        }

        private void swim(int k) {
            while (k > 1 && less(k/2, k)) {
                exch(k/2, k);
                k = k/2;
            }
        }

        private void sink(int k) {
            while (2*k <= n) {
                int j = 2*k;
                if (j < n && less(j, j+1)) j++;
                if (!less(k, j)) break;
                exch(k, j);
                k = j;
            }
        }

        private void exch(int i, int j) {
            int tmp = pq[i];
            pq[i] = pq[j];
            pq[j] = tmp;
        }

        private boolean less(int i, int j) {
            return pq[i] - pq[j] < 0;
        }
    }
}