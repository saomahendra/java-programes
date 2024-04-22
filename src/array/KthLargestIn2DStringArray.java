package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestIn2DStringArray {
    public static void main(String[] args) {

    }

    public static String findKthLargestwithQ(String[][] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Flatten the 2D array and convert strings to integers
        for (String[] row : arr) {
            for (String str : row) {
                int num = Integer.parseInt(str);
                if (minHeap.size() < k) {
                    minHeap.offer(num);
                } else if (num > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.offer(num);
                }
            }
        }

        // The kth largest element will be at the top of the heap
        return minHeap.peek().toString();
    }

    public static String findKthLargest(String[][] arr, int k) {
        List<Integer> numbers = new ArrayList<>();

        // Flatten the 2D array and convert strings to integers
        for (String[] row : arr) {
            for (String str : row) {
                numbers.add(Integer.parseInt(str));
            }
        }

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        // Get the kth largest element
        return numbers.get(k - 1).toString();
    }
}
