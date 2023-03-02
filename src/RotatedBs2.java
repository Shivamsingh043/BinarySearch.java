public class RotatedBs2 {
    public static void main(String[] args){
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 5;
        System.out.println(search(nums, target));
    }
    static boolean search(int[] nums, int target){
        int pivot = findPivot(nums);
        if (pivot ==  -1){
            int result1 = binarySearch(nums, target, 0, nums.length - 1);
            if (target == result1){
                return true;
            }
        }
        if (target == nums[pivot]){
            return true;
        }
        if (target < nums[0]){
            int result2 = binarySearch(nums, target, pivot + 1, nums.length - 1);
            if (target == result2){
                return true;
            }
        }
        if (target >= nums[0]){
            int result3 = binarySearch(nums, target, 0, pivot - 1);
            if (target == result3){
                return true;
            }
        }
        return false;
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid];
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid - 1];
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
