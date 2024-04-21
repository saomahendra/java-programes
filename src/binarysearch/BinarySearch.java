package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,6,7,9};
        System.out.println(binarySearch(intArr, 9));
    }

    static int binarySearch(int[] intArr, int target){
        int left = 0;
        int right = intArr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;
            if(target == intArr[mid]) return  mid;
            if(target < intArr[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return  -1;
    }
}
