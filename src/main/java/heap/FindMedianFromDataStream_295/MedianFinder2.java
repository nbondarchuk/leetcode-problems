package heap.FindMedianFromDataStream_295;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder2 {

    private final PriorityQueue<Integer> maxHeap;

    private final PriorityQueue<Integer> minHeap;

    public MedianFinder2() {
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.size() == minHeap.size()) {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        } else {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2d;
        }
        return minHeap.peek();
    }
}
