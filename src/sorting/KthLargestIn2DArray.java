package sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestIn2DArray {
    public static void main(String[] args) {

        int[][] matrix = {
                //{1, 5, 9},
                {10, 11, 13},
                {1, 5, 9},
                {12, 13, 15}
        };
        int k = 8;
        int result = kthLargestIn2DArray(matrix, k);
        System.out.println("The " + k + "th largest element in the 2D array is: " + result);

    }

    static int kthLargestIn2DArray(int[][] matrix, int k) {

        int row = matrix.length;
        int col = matrix[0].length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                priorityQueue.offer(matrix[i][j]);
                System.out.println(priorityQueue);
                if (priorityQueue.size() > k) {
                    priorityQueue.poll();
                }

            }
        }

        return priorityQueue.peek();

    }

    public static int findKthLargest(int[][] arr, int k) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[] flattenedArray = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattenedArray[index++] = arr[i][j];
            }
        }

        Arrays.sort(flattenedArray); // Sorting in ascending order
        // To get the kth largest, we can consider the (length - k)th element from the end.
        return flattenedArray[flattenedArray.length - k];
    }
}
