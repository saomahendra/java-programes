package binarysearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // (left + right) / 2

            if (nums[mid] == target)
                return mid;

            // if left to mid is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // mid to right part is sorted
                if (nums[mid] < target && target <= nums[right]) { // min, max
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
